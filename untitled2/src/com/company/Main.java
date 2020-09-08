package com.company;


import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {


    public static void main(String[] args) throws InterruptedException {
     MyReWriter war_and_peace = new MyReWriter("src/com/company/War and Peace");
     MyReWriter test = new MyReWriter("src/com/company/test");

     war_and_peace.reWrite(test);


    }
}

