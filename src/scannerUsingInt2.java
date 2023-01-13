import java.util.Scanner;

public class scannerUsingInt2 {
    public static void main(String[] args) {

        Scanner inputs=new Scanner(System.in);
        System.out.println("Please enter your length");         //When a user is ask to enter a number.
        int length=inputs.nextInt();                          //And it captured using int data type
        System.out.println("Please enter your width");
        int width=inputs.nextInt();


        if(length!=width){                                             //And the condition is to determine if length or width is a square or rectangle.
            System.out.println("The shape of your object is rectangle");  //rectangles has one size long and the other short. for example 8 for length & 3 for width
        }

        else {
            System.out.println("The shape of your object is square"); //In other to be square the sizes should be even. for example 4length and 4 width.
        }


    }
}
