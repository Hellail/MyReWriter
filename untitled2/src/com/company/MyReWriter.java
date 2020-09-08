package com.company;

import java.io.*;

public class MyReWriter {
    private String path1;

    public MyReWriter(String path1) {
        this.path1 = path1;
    }




    int countWord() {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(this.path1))) {
            String symbol = reader.readLine();
            while (symbol != null) {
                String[] strings = symbol.split(" ");
                count += strings.length;
                symbol = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }

    void countWord(MyReWriter log) {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(this.path1));
             BufferedWriter logWriter = new BufferedWriter(new FileWriter(log.path1))) {
            String symbol = reader.readLine();
            while (symbol != null) {
                String[] strings = symbol.split(" ");
                count += strings.length;
                symbol = reader.readLine();
            }
            logWriter.write(String.valueOf(count));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void reWrite(MyReWriter writer) {
        try (BufferedInputStream fileInputStream = new BufferedInputStream(new FileInputStream(this.path1));
             BufferedOutputStream fileOutputStream = new BufferedOutputStream(new FileOutputStream(writer.path1))) {
            while (fileInputStream.available() > 0) {
                int oneByte = fileInputStream.read();
                fileOutputStream.write(oneByte);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void clear() {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(this.path1))) {
            writer.write("");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
