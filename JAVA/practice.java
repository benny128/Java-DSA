// import java.util.Scanner;

/*
// ------------------------------------------------------------TYPES OF OPERATORS-------------------------------------------------------------------


1.AIRTHMETIC 
2.RELATIONAL
3.LOGICAL
4.BITWISE
5.ASSIGNMENT


*/


// -------------------------------------------------------------AIRTHMETIC OPERATOR-------------------------------------------------------------------




/* 

public class operators{
    public static void main(String args[]){
        int a=10;
        int b=5;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
    }

}*/





// -------------------------------------------------------------UNIRAY OPERATOR-------------------------------------------------------------------


/* 

public class operators{
    public static void main(String[] args) {
        int a=20;
        int b=--a;
        System.out.println(b);
    }
}

*/



// -------------------------------------------------------------RELATIONAL OPERATORS-------------------------------------------------------------------




/* 
public class operators{
    public static void main(String args[]){
        // Scanner sc =new Scanner(System.in);
        int a=10;
        int b=5;
        System.out.println(a<b);
    }
}



public class operators{
    public static void main(String[] args) {
        int a=10;
        int b=5;
        System.out.println(a!=b);
        System.out.println(a==b);
        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a<=b);
        System.out.println(a>=b);
    }
}

*/

// ----------------------------------------------------------------PRACTICE QUESTIIONS-----------------------------------------------------------------------------



// Question : What will be the output of the following programs :



// public class Test {
// public static void main(String[] args){
// int x = 2, y = 5;
// int exp1 = (x * y / x);
// int exp2 = (x * (y / x));
// System.out.print(exp1 + ",");
// System.out.print(exp2);
// }
// }



// public class Test {
// public static void main(String[] args) {
// int x = 200, y = 50, z = 100;
// if(x > y && y > z){
// System.out.println("Hello");
// }
// if(z > y && z < x){
// System.out.println("Java");
// }
// if((y+200) < x && (y+150) < z){
// System.out.println("Hello Java");
// }
// }
// }
 

// public class Test {
// public static void main(String[] args){
// int x, y, z;
// x = y = z = 2;
// x += y;
// y -= z;
// z /= (x + y);
// System.out.println(x + " " + y + " " + z);
// }
// }



// ----------------------------------------------------------------BREAK STATEMENT-----------------------------------------------------------------------------





// import java.util.*;
// public class Test{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
       
//      do { 
//         System.out.println("Enter the number");
//          int n=sc.nextInt();
//          if(n%10==0){
//             break;
//          }
//      } while (true);
//     }
// }


// import java.util.*;
// public class Test{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//       while (true) { 
//           System.out.println("enter the number:");
//           int num=sc.nextInt();
//           if(num%10==0){
//             break;
//           }
//       }}

//     }



// import java.util.Scanner;
// class Frist{
//     public static void main(String[] args){
//      Scanner sc = new Scanner(System.in);
//      int a = sc.nextInt();
//      int b=sc.nextInt();
//      int sum=a+b;
//      System.out.println(sum);
//     }
// }

// import java.util.Scanner;
// class First{
//     public static void main(String[] args){
//        Scanner sc = new Scanner (System.in);
//         String name=sc.nextLine();
//         System.out.println(name);

//     }
// }






// ----------------------------- IF /ELSE STATEMENT-----------------------------





// import java.util.Scanner;
// class First{
//     public static void main(String[]args)
//     {
//         Scanner sc= new Scanner(System.in);
//         int age=sc.nextInt();
//         if(age>18){
//             System.out.print("tum bade ho gaye ho");
//         }
//         else{
//             System.out.print("hatt saale baccha hai");
//         }
//     }
// }




// import java.util.Scanner;
// class Frist{
//     public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);
//         int num=sc.nextInt();
//         if(num%2==0){
//             System.out.print("this is even number");
//         }
//         else{
//             System.out.println("This is odd number");
//         }
//     }
// }





// import java.util.Scanner;
// class Frist{
//     public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);
//         int a=sc.nextInt();
//         int b= sc.nextInt();
//         if(a==b){
//             System.out.println("they are Equal");
//         }
//         if(a>b){
//             System.out.println("a is greater than b");
//         }
//         else{
//             System.out.println("b is greater than a");
//         }
//     }
// }






// import java.util.Scanner;
// class First{
//     public static void main(String[] args)
//     {
//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        if(a==1){
//         System.out.print("hello");
//        }
//        else if(a==2){
//         System.out.print("namaste");
//        }
//        else if(a==3){
//         System.out.print("Bonjour");
//        }
//     }
// }


// import java.util.Scanner;
// class First{
//     public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);
//         int button=sc.nextInt();
//         switch(button){
//             case 1:System.out.println("red");
//             break;
//             case 2:System.out.println("green");
//             break;
//             case 3:System.out.println("yellow");
//             break;
//             default:System.out.println("invailed number");
//             break;
//         }
        
//     }
// }





// import java.util.Scanner;
// class First{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         String opt=sc.next();
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         switch(opt){
//             case "+":System.out.println(a+b);
//             break;
//             case "-":System.out.println(a-b);
//             break;
//             case "*":System.out.println(a*b);
//             break;
//             case "/":System.out.println(a/b);
//             break;
//         }
//     }
// }



// --------------------------------------------------------------CONTINUE STATEMENT-----------------------------------------------------------------------------


// public class Test{
//     public static void main(String args[]){
//         for(int i=1;i<=5;i++){
//             if(i==3){
//                 continue;
//             }
//             System.out.println(i);
//         }
//     }
// }


// import java.util.*;
// public class Test{
//     public static void main(String args[])
//     {
//         Scanner sc=new Scanner(System.in);
//         int i=0;
//         while(true)
//         {
//              System.out.println("Enter the num :");
//              int n=sc.nextInt();
//              if(n%10==0)
//             {
//                 continue;
//             }
//             System.out.println(n);
//         }
        
//     }
// }





// --------------------------------------------------------------STAR PATTERN-----------------------------------------------------------------------------


// public class Test{
//     public static void main(String args[]){
//         for(int line=1;line<=50;line++){
//             for(int star=1;star<=line;star++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// public class Test{
//     public static void main(String[] args) {
//         for(int line=1;line<=4;line++){
//             for(int Number=1;Number<=line;Number++){
//                 System.out.print(Number);
//             }
//         System.out.println();

//         }
//     }
// }


// public class Test{
//     public static void main(String args[]) {
//         for(int line=1;line<=4;line++){
//             for(char Chars=1;Chars<=line;Chars++){
//                 System.out.print(Chars);
//             }
//         System.out.println();

//         }
//     }
// }


// import java.util.*;
// public class Test{

//     public static int cal(int num1,int num2){
//         int sum=num1+num2;
//         return sum;
//     }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int sum= cal(a,b);
//         System.out.println(sum);
//     }
// }


// public class practice{ 
//     public static void main(String args[]){
//         int marks=70;
//         System.out.print("marks");
//         System.out.print(marks);
//     }
// }

//import java.util.*;
//public class practice{


//-------------------------------------------------------------------FACTORIAL OF N----------------------------------------------------------------





// public static int factorial(int n){
//     int f=1;
//     for(int i=1;i<=n;i++){
//         f=f+i;
//     }
//     return f;
// }
// public static void main(String[] args) {
//     System.out.println(factorial(4));
// }





//-------------------------------------------------------------------BIONOMAIL COFFICENT----------------------------------------------------------------




// public static int factorial(int n){
//     int f=1;
//     for(int i=1;i<=n;i++){
//         f=f*i;
//     }
//     return f;
// }
// public static int binom(int n,int r){
//     int fact_n=factorial(n);
//     int fact_r=factorial(r);
//     int fact_nmr=factorial(n-r);

//     int binom=fact_n/(fact_r*fact_nmr);
//     return binom;
// }
// public static void main(String[] args) {
//     System.out.println(binom(5,2));
// }


// public static int sum(int a,int b){
//     return a+b;
// } 
// public static float sum(float a,float b){
//     return a+b;
// }
// public static void main(String[] args) {
//     System.out.println(sum(4,5));
//     System.out.println(sum(1.5f,2.5f));
// }

// public class practice{
// public static void holo(int row,int col){
//     for(int i=1;i<=row;i++){
//         for(int j=1;i<=col;j++){
//             if(i==1 || i==row || j==1 || j==col){
//                 System.out.println("*");
//             }
//             else{
//                 System.out.println("");
//             }
//         }
//         System.out.println();
//     }
// }
// }
// public static void main(String args[]){
//     holo(4,4);
// }



//-------------------------------------------------------------------SOLID ROMBOUS----------------------------------------------------------------




// public static void romb(int n){
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=n-i;j++){
//             System.out.print(" ");
//         }
//         for(int j=1;j<=n;j++){
//                 System.out.print("*");
//             }
//         System.out.println();
//     }
// }
//   public static void main() {
//     romb(5);
//     }

//-------------------------------------------------------------------HOLLOW ROMBOUS----------------------------------------------------------------

// public static void hollow(int n){
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=(n-1);j++){
//             System.out.print(" ");

//              if(i==1 || i==n || j==1 || j==n){
//             System.out.print("*");
//         }
//         else{
//             System.out.print(" ");
//         }
//         }
//         System.out.println();
//     }
// }
// public static void main(String[] args) {
//     hollow(5);
// }

//-------------------------------------------------------------------DIAMOND PATTERN----------------------------------------------------------------

// public static void dimond(int n){
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=n-i;j++){
//             System.out.print(" ");
//         }
//         for(int j=1;j<=(2*i-1);j++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }    
// }
// public static void main(String[] args) {
//     dimond(5);
// }

//-------------------------------------------------------------------ARRAYS----------------------------------------------------------------



// import java.util.*;

public class practice{
    public static int findnumber(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,6,7,8,9,10};
        int key=5;
        int index=findnumber(numbers,key);
        if(index==-1){
            System.out.print("not found");
        }
        else{
            System.out.println("invalid");
        }
    }
}