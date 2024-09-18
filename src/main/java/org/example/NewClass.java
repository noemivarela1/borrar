package org.example;

import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        long pid = ProcessHandle.current().pid();
        System.out.println("New Class with pid:"+pid);

        Scanner in=new Scanner(System.in);
        System.out.println("Set a number:");
        int number=in.nextInt();
        System.out.println("the number is:"+number);
        System.out.println("Set another number:");
        int number2=in.nextInt();
        System.out.println("the second number is:"+number2);
    }
}
