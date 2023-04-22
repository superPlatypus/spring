package com.example._12;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String fileName1;
        String fileName2;
        Scanner sc = new Scanner(System.in);
//        fileName1 = sc.next();
//        fileName2 = sc.next();
        fileName1 = "file1.txt";
        fileName2 = "file2.txt";
        Application1 app = new Application1();
        app.run(fileName1, fileName2);
    }
}
