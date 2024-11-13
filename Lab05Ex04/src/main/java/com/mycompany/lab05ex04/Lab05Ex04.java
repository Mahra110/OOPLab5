package com.mycompany.lab05ex04;
import java.util.Scanner;
public class Lab05Ex04 {
public int noOfInput;

public int fibSeries(int n)
{ if (n<=1)
  return n;
else       
  return fibSeries(n-1)+fibSeries((n-2));   }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        Lab05Ex04 obj=new Lab05Ex04();
        obj.noOfInput=sc.nextInt();
                 System.out.println("Fibonacci series up to " +obj.noOfInput + " terms: ");
      for (int i = 0; i <obj.noOfInput ; i++) { System.out.print(obj.fibSeries(i)+" " );}}}
