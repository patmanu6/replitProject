import java.util.Scanner;

public class scannerUsingIf {
    public static void main(String[] args) {

        Scanner inputs=new Scanner(System.in);
        System.out.println("Please enter your age");   //When voters are ask to enter their age
        int age=inputs.nextInt();                    //And int data type is used to capture ages
        if(age>=18){
            System.out.println("You are eligible to vote");  //And necessary conditions which should be met before casting votes.
        }else{
            System.out.println("You are not eligible to vote");
        }

    }
}
