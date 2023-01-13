import java.util.Scanner;

public class scannerBoolean {
    public static void main(String[] args) {

        Scanner inputs=new Scanner (System.in);     //Given a Scanner class imported
        System.out.println("Are you hungry?");        //And users input was captured and reveal
        boolean happy=inputs.nextBoolean();            // boolean happy=inputs.nextBoolean();
        if(!happy==true){
            System.out.println("Ok then let me know if you are hungry");
        }else {
            System.out.println("There is some food in the fridge please warm it up");
        }
    }
}
