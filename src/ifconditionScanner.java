import java.util.Scanner;

public class ifconditionScanner {
    public static void main(String[] args) {

        Scanner inputs=new Scanner (System.in);
        System.out.println("What is your name?");
        String name=inputs.nextLine();
        if(name.equals("Chen")){
            System.out.println(" Your are the teacher!");
        }else System.out.println("Student");
    }
}
