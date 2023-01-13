import java.util.Scanner;

public class scannerBoolean1 {
    public static void main(String[] args) {

        Scanner inputs=new Scanner(System.in);

        System.out.println("Is it sunny outside");
        boolean sunny=inputs.nextBoolean();

        if(sunny){                                               //When user is ask about the weather
            System.out.println("I will go to the market");  //And depending on situation user used his/her choice to decide what works better.
        }else {
            System.out.println("I will just chill");
        }

        System.out.println("What is the temp outside");
        int temp=inputs.nextInt();


        if(temp>80){
            System.out.println("I am going to the beach");

        }else {
            System.out.println("I will do my homework@home");
        }

    }
}
