/*In a program, input 3 numbers : A, B and C. You have to output the average of these 3 numbers.



import java.util.*;
public class chapter1{
    public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int avg=(a+b+c)/3;
    System.out.println(avg);
    }
}




*/



/*Question 2: In a program, input the side of a square. You have to output the area of the
square.
(Hint : area of a square is (side x side)).



import java.util.*;
public class chapter1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side");
        float side=sc.nextFloat();
        float area=side*side;
        System.out.println("The side is :" + area);
    }
}





*/



/* Question 3: Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
an eraser. You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
 



import java.util.*;
public class chapter1{
    public static void main(String args[]) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the price of items : ");
        float pen=sc.nextFloat();
        float pencil=sc.nextFloat();
        float eraser=sc.nextFloat();
        float total=pen+pencil+eraser;
        float newTotal=total+(0.18f*total);
        System.out.println("Bill without Gst : " + total);
        System.out.println("Bill with Gst : " + newTotal);
    }
}




*/


/*Question 5: (Advanced) Will the following statement give any error in Java?
int $ = 24;


public class chapter1{
    public static void main(String[] args) {
        int $=24;
        System.out.println($);
    }
}

*/