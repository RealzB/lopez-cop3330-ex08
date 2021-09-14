package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 6 Solution
 *  Copyright 2021 Brandon Lopez
 */
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many people?");
        String uipeople = sc.nextLine();
        System.out.println("How many pizzas do you have?");
        String uipizzas = sc.nextLine();
        System.out.println("How many slices per pizza?");
        String uislices = sc.nextLine();
        Integer people = Integer.valueOf(uipeople);
        Integer pizzas = Integer.valueOf(uipizzas);
        Integer slices = Integer.valueOf(uislices);

        String infoDump = String.format("%d people with %d pizzas (%d slices)", people, pizzas, (slices*pizzas));
        String pizzaDistribution = String.format("Each person gets %d pieces of pizza.", (slices*pizzas)/people);
        String leftovers = String.format("There are %d leftover pieces.", (slices*pizzas)%people);

        System.out.println(infoDump);
        System.out.println(pizzaDistribution);
        System.out.println(leftovers);



    }
}