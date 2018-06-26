package com.editor;
import java.io.*;
import java.nio.file.FileSystem;

public class Main {
    public static void main(String[] args) {
        openTxtFile();
    }

    private static void openTxtFile(){
        File testFilePath = new File("/home/mel/Documents/test.txt");
        String line= null;
        try{
            FileReader fileReader = new FileReader(testFilePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" +
                            testFilePath + "'");
        } catch (IOException err) {
            err.printStackTrace();
        }
    }
}
