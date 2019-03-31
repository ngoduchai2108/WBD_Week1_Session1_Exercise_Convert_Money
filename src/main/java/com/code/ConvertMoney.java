package com.code;

import java.util.Scanner;

public class ConvertMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Numbers USD:");
        int usd = scanner.nextInt();
        System.out.println("Enter Exchange rate(USD/VND): ");
        int exchangeRate = scanner.nextInt();
        System.out.println(usd+ " USD = "+ usd*exchangeRate+" VND.");
    }
}
