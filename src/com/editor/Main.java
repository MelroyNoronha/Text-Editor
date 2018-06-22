package com.editor;

public class Main {
    public static void main(String[] args) {
        openTxtFile("/home/", "test.txt");
    }

    private static void openTxtFile(String filePath, String fileName){
        System.out.println(filePath+fileName);
    }
}
