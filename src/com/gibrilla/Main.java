//package com.gibrilla;
//
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectOutputStream;
//
//public class Main {
//
//    public static void main(String[] args) {
//        String fileName = "out.bin";
//        try {
//            FileOutputStream fileOS = new FileOutputStream(fileName);
//            ObjectOutputStream as = new ObjectOutputStream(fileOS);
//            fileOS.write(2048);
//            fileOS.write((int) 3.1415);
//            fileOS.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println("Done writing");
//        try {
//            FileOutputStream fileIs = new FileOutputStream(fileName);
//            ObjectOutputStream is = new ObjectOutputStream(fileIs);
//            int x = 0;
//            is.writeInt(0b100000000000);
//            System.out.println(x);
//            double d = 0;
//            is.writeDouble(3.1415);
//            System.out.println(d);
//            is.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
//
