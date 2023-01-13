import java.util.Scanner;

public class scannerUsingConditionalIf {
    public static void main(String[] args) {


        Scanner inputs=new Scanner (System.in);
        System.out.println("Please enter any number");
        int num=inputs.nextInt();                                  //When a user enter any number

        if(num>0){
            System.out.println(num+" is a positive number");       //Any the entered number is >0 then it is a positive number
        }if(num<0){
            System.out.println(num+" is a negative number");    //Otherwise any number less than 0 is considered negative

        }else{
            System.out.println("Entered number is 0");
        }




    }
}
