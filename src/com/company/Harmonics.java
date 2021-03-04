package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Harmonics {
    private static double harmonics(int n) {
        double sum = 0.0;
        for (int i = 0; i < n; n++) {
            sum += 1/i;
        }
        return sum;
    }
    public static int abs(int n) {
        if(n < 0)
            return -n;
        else
            return n;
    }

    public static double abs (double n) {
        if (n < 0.0)
            return -n;
        else
            return n;
    }
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = null;
        Scanner sc = null;
        try{
            fileInputStream = new FileInputStream("C:\\Users\\Favour\\Documents\\whitelist.txt");
            sc = new Scanner(fileInputStream, "UTF-8");
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            if (sc.ioException() != null) {
                throw sc.ioException();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            if (sc != null) {
                sc.close();
            }
        }
    }
}
