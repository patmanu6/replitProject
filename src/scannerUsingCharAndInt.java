import java.util.Scanner;

public class scannerUsingCharAndInt {
    public static void main(String[] args) {

        Scanner inputs=new Scanner (System.in);
        System.out.println("Please enter your gender");
        char gender=inputs.next().charAt(0);                    //When user is ask to enter is age
        System.out.println("Please enter your age");           //And user input is captured and stored
        int age=inputs.nextInt();                               //And to determine if users is male or female due to condition


        if(age>25)if(gender=='f'){{                               //Then user data will be printed
            System.out.println("Then she is a woman");
        }}else {
            System.out.println("Man");
        }else if(gender=='F'){
            System.out.println("Girl");

        }else {
            System.out.println("Boy");
        }


    }
}
