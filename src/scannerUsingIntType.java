import java.util.Scanner;

public class scannerUsingIntType {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your age");        //Given user's unknown age
        int age=input.nextInt();                     //And was captured and added 10 to it

        System.out.println("your age after 10 years is "+(age+10));   //Then the results is the age+10.
    }
}
