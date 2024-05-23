package org.example;

import java.io.*;

public class SQLReader {
    public static String read(String filename) {
        try(BufferedReader br = new BufferedReader(new FileReader(new File(filename)))){
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();

        while (line != null) {
            sb.append(line).append("\n");
            line = br.readLine();
        }

        return sb.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
