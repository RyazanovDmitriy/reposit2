package org.example;

import java.io.File;

public class Main {
    public static void main(String[] args) {
    String folderPatch = "C:\\Users\\Дмитрий\\Desktop\\Новая папка";
        File file = new File(folderPatch);
        System.out.println(file.length());
        System.out.println(getFolder(file));

    }
    public static long getFolder (File folder){
        if (folder.isFile()){
            return folder.length();
        }
        long sum = 0;
        File[] files = folder.listFiles();
        for (File file : files)
        {
            sum += getFolder(file);
        }
return sum;
    }
}