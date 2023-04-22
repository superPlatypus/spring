package com.example._12;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

@Component
public class FileWorker {
    private File input;
    private File output;
    private String hash;

    public FileWorker(String input, String output) {
        this.input = new File(input);
        this.output = new File(output);
    }

    @PostConstruct
    public void init(){
        try {
            FileWriter writer = new FileWriter(output);
            FileReader reader = new FileReader(input);
            Scanner sc = new Scanner(reader);
            hash = sc.nextLine();
            writer.write(hash);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

