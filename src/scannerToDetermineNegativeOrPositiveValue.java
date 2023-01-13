import java.util.Scanner;

public class scannerToDetermineNegativeOrPositiveValue {
    public static void main(String[] args) {

        Scanner inputs=new Scanner(System.in);
        System.out.println("Please enter first number");        //when a user enters a number
        int x=inputs.nextInt();                                //And inputs is captured
        System.out.println("Please enter second number");
        int y=inputs.nextInt();

        if(x*y>0){
            System.out.println("The number you entered is positive");   //Then the condition is to determine if number entered is negative or positive when multiply.
        }else{
            System.out.println("The number you entered is negative");
        }







    }
}
