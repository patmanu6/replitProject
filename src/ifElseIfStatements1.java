import java.util.Scanner;

public class ifElseIfStatements1 {
    public static void main(String[] args) {
        Scanner inputs=new Scanner(System.in);
        System.out.println("Please enter a number");
        int num=inputs.nextInt();

        if(num%2==0)if(num>1000){
            System.out.println("Then it is a even number");
            System.out.println("The even number is larger");
        }
        else {
            System.out.println("Even value is just right");
        }else  {
            System.out.println("Value is odd");

        }if(num%2>1000){
            System.out.println("Odd value is larger");
        }else {
            System.out.println("odd value is just right");
        }




    }
}
