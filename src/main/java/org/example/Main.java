package org.example;

import fibonachi.DinamicProgramuvannia;
import fibonachi.Iteraziia;
import fibonachi.Recursia;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number: ");
        int n = sc.nextInt();

        System.out.println("The result of executing the recursive function:: " + Recursia.fiboRecursive(n));
        System.out.println("Result of executing a dynamic function: " + DinamicProgramuvannia.fiboDynamic(n));
        System.out.println("Result of executing an iterative function: " + Iteraziia.fiboIterative(n));
    }
}