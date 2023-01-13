import java.util.Scanner;

public class ifElseIfStatements2 {
    public static void main(String[] args) {

        Scanner inputs=new Scanner(System.in);
        System.out.println("Please enter 3 distinct numbers");
        int num1=inputs.nextInt();
        int num2=inputs.nextInt();
        int num3=inputs.nextInt();


      if(num1>num2){if(num1>num3){

          System.out.println("Then num2 is the largest "+num1);

      }else {
          System.out.println("The num2 is the largest "+num2);

      }} else if(num3>num2){
          System.out.println("The num3 is the largest "+num3);

        }









    }
}
