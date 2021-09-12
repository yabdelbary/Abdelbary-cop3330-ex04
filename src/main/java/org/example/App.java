package org.example;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a noun: ");
        String noun = sc.nextLine();
        System.out.println("enter a verb: ");
        String verb = sc.nextLine();
        System.out.println("enter an adjective: ");
        String adjective = sc.nextLine();
        System.out.println("enter an adverb: ");
        String adverb = sc.nextLine();
        System.out.println("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "?" + " That's hilarious!");


    }
}
