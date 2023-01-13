import java.util.Scanner;

public class scannerUsingStringsAndInts {
    public static void main(String[] args) {

        Scanner inputs=new Scanner(System.in);
        System.out.println("Please Enter your name");
        String name=inputs.next();
        System.out.println("Please your mobile number");
        String phoneNumber=inputs.next();
        System.out.println("Please enter your age");
        int age=inputs.nextInt();
        System.out.println("Your name is Elise, your age is "+age+ " and your mobile number is "+phoneNumber);







    }
}
