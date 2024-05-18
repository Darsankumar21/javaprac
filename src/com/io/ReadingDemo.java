package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadingDemo {

    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("E:\\javastunt2\\input.txt");
            FileOutputStream output = new FileOutputStream("E:\\javastunt2\\output.txt");

            System.out.println("Copying data from input.txt to output.txt...");

            int i = input.read();
            while (i != -1) {
                output.write(i); // Write data to output stream
                i = input.read();
            }

            System.out.println("Data copied successfully.");

            input.close();
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
