/*

Question 1 : Write a Java program to get a number from the user and print whether it is
positive or negative 




Question 2 : Finish the following code so that it prints You have a fever if your temperature
is above 100 and otherwise prints You don't have a fever.



public class chapter3 {
public static void main(String[] args) {
double temp = 19.5;
if (temp<100) {
    System.out.println("you dont have fever");
}
else {
    System.out.println("you have fever");
}
}
}


Question 3 : Write a Java program to input week number(1-7) and print day of week name
using switch case.



import java.util.Scanner;
public class chapter3{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int day=sc.nextInt();
        switch(day){
            case 1:System.out.println("Monday");
            break;
            case 2:System.out.println("tuesday");
            break;
            case 3:System.out.println("wed");
            break;
            case 4:System.out.println("tHUR");
            break;
            case 5:System.out.println("firday");
            break;
            case 6:System.out.println("sat");
            break;
            case 7:System.out.println("sun");
        }
    }
}


Question 4 : What will be the value of x & y in the following program.



public static void main(String args[]) {
int a = 63, b = 36;
boolean x = (a < b ) ? true : false;
int y= (a > b ) ? a : b;
}
}


ANSWER------63



Question 5 : Write a Java program that takes a year from the user and print whether that
year is a leap year or not.
*/
// import java.util.*;
// public class chapter3{
//     public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int year=sc.nextInt();
//        if(year%4==0 && (year%400==0 || year%100!=0) ){
//         System.out.print("Entered year is  not a leap year");
//        }
//        else{
//         System.out.println("invalid num");
//        }
//     }
// }

import java.util.*;
public class chapter3 {
    public static void main(String[] args) {
        System.out.print("Enter any number : ");
        Scanner sc=new Scanner (System.in);
        int num=sc.nextInt();
        if(num<0){
            System.out.println("Entered number is Negative");
        }
        else{
            System.out.println("Entered number is Postive");
        }
    }
}
