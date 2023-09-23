package org.example;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) throws IOException {
        Integer[] integers = new Integer[] {1, 3, 5};

        FileOutputStream fos = new FileOutputStream("file.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(integers);

        fos.close();
    }
}
