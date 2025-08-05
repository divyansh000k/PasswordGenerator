package com.divyansh1.projects;

import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String number = "0123456789";
        String symbols = "@#$%^&*()_+[]{}|;:,.<>?";

        System.out.print("Enter the length of password : ");
        int length = sc.nextInt();
        System.out.println("Enter Y for yes or N for no");
        System.out.print("Include upper(Y/N) : ");
        String  IncludeUpper = sc.next();
        String allowedChars = "";
        if (IncludeUpper.equalsIgnoreCase("Y")){
            allowedChars += upper;
        }
        System.out.print("Include lower(Y/N) : ");
        String  IncludeLower = sc.next();
        if (IncludeLower.equalsIgnoreCase("Y")){
            allowedChars += lower;
        }
        System.out.print("Include number(Y/N) : ");
        String  IncludeNumber = sc.next();
        if (IncludeNumber.equalsIgnoreCase("Y")){
            allowedChars += number;
        }
        System.out.print("Include symbol(Y/N) : ");
        String  IncludeSymbol = sc.next();
        if (IncludeSymbol.equalsIgnoreCase("Y")){
            allowedChars += symbols;
        }

        Random rand = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = rand.nextInt(allowedChars.length());
            password.append(allowedChars.charAt(index));
        }
        System.out.println("Password generated : "+password.toString());
    }
}
