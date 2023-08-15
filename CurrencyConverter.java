/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basic;

/**
 *
 * @author kisha
 */
import java.util.*;
import java.text.DecimalFormat;
 
public class CurrencyConverter
{
   public static void main(String[] args)
   {
      double amount;
      double rupee, dollar, pound, euro, yen;
      int choice;
 
      DecimalFormat f = new DecimalFormat("##.##");
 
      Scanner sc = new Scanner(System.in);
 
      System.out.println("Following are the Choices:");
      System.out.println("Enter 1: Ruppe");
      System.out.println("Enter 2: Dollar");
      System.out.println("Enter 3: Pound");
      System.out.println("Enter 4: Euro");
      System.out.println("Enter 5: Yen");
 
      System.out.print("\nChoose from above options: ");
      choice = sc.nextInt();
 
      System.out.println("Enter the amount you want to convert?");
      amount = sc.nextFloat();
 
      switch (choice)
      {
         case 1:  // Rupee Conversion
            dollar = amount / 82.6746;
            System.out.println(amount + " Rupee = " + f.format(dollar) + " Dollar");
 
            pound = amount / 105.52;
            System.out.println(amount + " Rupee = " + f.format(pound) + " Pound");
 
            euro = amount / 91.16;
            System.out.println(amount + " Rupee = " + f.format(euro) + " Euro");
 
            yen = amount / 0.57;
            System.out.println(amount + " Rupee = " + f.format(yen) + " Yen");
 
            break;
 
         case 2:  // Dollar Conversion
            rupee = amount * 82.6746;
            System.out.println(amount + " Dollar = " + f.format(rupee) + " Ruppes");
 
            pound = amount *0.78;
            System.out.println(amount + " Dollar = " + f.format(pound) + " Pound");
 
            euro = amount *0.91;
            System.out.println(amount + " Dollar = " + f.format(euro) + " Euro");
 
            yen = amount *144.17;
            System.out.println(amount + " Dollar = " + f.format(yen) + " Yen");
 
            break;
 
         case 3:  // Pound Conversion
            rupee = amount * 105.52;
            System.out.println(amount + " pound = " + f.format(rupee) + " Ruppes");
 
            dollar = amount *1.28;
            System.out.println(amount + " pound = " + f.format(dollar) + " Dollar");
 
            euro = amount *1.16;
            System.out.println(amount + " pound = " + f.format(euro) + " Euro");
 
            yen = amount *184.02;
            System.out.println(amount + " pound = " + f.format(yen) + " Yen");
 
            break;
 
         case 4:  // Euro Conversion
            rupee = amount * 91.16;
            System.out.println(amount + " euro = " + f.format(rupee) + " Ruppes");
 
            dollar = amount *1.10;
            System.out.println(amount + " euro = " + f.format(dollar) + " Dollar");
 
            pound = amount *0.86;
            System.out.println(amount + " euro = " + f.format(pound) + " Pound");
 
            yen = amount *127.32;
            System.out.println(amount + " euro = " + f.format(yen) + " Yen");
 
            break;
 
         case 5:  // Yen Conversion
            rupee = amount *0.57;
            System.out.println(amount + " yen = " + f.format(rupee) + " Ruppes");
 
            dollar = amount *0.0069;
            System.out.println(amount + " yen = " + f.format(dollar) + " Dollar");
 
            pound = amount *0.0054;
            System.out.println(amount + " yen = " + f.format(pound) + " Pound");
 
            euro = amount *0.007;
            System.out.println(amount + " yen = " + f.format(euro) + " Euro");
 
            break;

 
          //Default case
         default:
            System.out.println("Invalid Input");
      }
   }
}