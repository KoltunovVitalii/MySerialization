package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("file.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Integer[] integers = (Integer[]) ois.readObject();
        System.out.println(Arrays.toString(integers));
        ois.close();
    }
}
