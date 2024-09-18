package org.example;

import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        long pid = ProcessHandle.current().pid();
        System.out.println("New Class with pid:"+pid);

        Scanner in=new Scanner(System.in);
        in.nextInt();
    }
}
