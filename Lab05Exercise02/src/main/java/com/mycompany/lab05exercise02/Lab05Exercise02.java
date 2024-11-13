package com.mycompany.lab05exercise02;
import java.util.Scanner;
public class Lab05Exercise02 {
    int noOfCalories=0;
    int prime;
    int even;
    int odd;
    public int checkPrime(int n)
    {int counter=0;
for (int i=1;i<=n;i++)
{if (n%i==0){
 counter++;    }}
if (counter==2)
{ return n;}
else {
    return 0;
}}
 public int calculatePrimeCalories(int input)
 {int sum1=0;  
     for (int i=2;i<input;i++){
        sum1+=checkPrime(i);}
     return sum1;}
 public int checkEven(int n)
 { if (n%2==0)   {
       return n;}
     else { return 0;}}
 public int calculateEvenCalories(int input)
 {
     int sum2=0;
     for (int i=0;i<input;i++)
     {
         sum2+=checkEven(i);
     }
     return sum2;
 }
 public int checkOdd(int n)
 {
     if (n%2!=0)
     {
         return n;
     }
     else {
         return 0;
     }
 }
 public int calculateOddCalories(int input)
 {
     int sum3=0;
     for (int i=0;i<input;i++)
     {
         sum3+=checkOdd(i);
     }
     return sum3;
 }
    public static void main(String[] args)
    {   Lab05Exercise02 obj=new Lab05Exercise02();
        Scanner sc=new Scanner(System.in);
                  System.out.println("Please Enter the duration of your workout in minutes (Enter a negative number to exit) ");

             obj.noOfCalories= sc.nextInt();
            while (obj.noOfCalories>0){
            
                System.out.println("No. of");
                System.out.println("Prime Number of Calories: "+obj.calculatePrimeCalories(obj.noOfCalories));
                System.out.println("Even Number of Calories: "+obj.calculateEvenCalories(obj.noOfCalories));
                System.out.println("Odd Number of Calories: "+obj.calculateOddCalories(obj.noOfCalories));
          System.out.println("Please Enter the duration of your workout in minutes (Enter a negative number to exit) ");
            obj.noOfCalories=sc.nextInt();
            }
            System.out.println("Exiting! ");
    }
}
