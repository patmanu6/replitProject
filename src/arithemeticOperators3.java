public class arithemeticOperators3 {
    public static void main(String[] args) {
//Math magic problem solving.

        int myNumber=4;   // Given a variable created(my Number) with value 4
        int stepOne=4*4;   // And was multiply by itself.
        int stepTwo=stepOne+myNumber;   //And a variable and value set to previous results(stepOne) + myNumber
        int stepThree=stepTwo/myNumber;
        int stepFour=stepThree+17;
        int stepFive=stepFour-myNumber;
        int stepSix=stepFive/6;

        System.out.println("The magic number is "+stepSix+ "!");

        int num1 = 5;
        int num2 = 4;
        int num3 = 3;
        int num4 = 7;
        int num5 = 10;
        int num6 = 5;

        int result1= (num1+num2)-num3;
        int result2=(num4*num5)/5;
        int results3=result2%result1;

        System.out.println(result2 + " modded by " +result1 +" is "+result2%result1);


int mod=14%2;
        System.out.println(mod); //modulus operation


        int mod1=29%4;
        System.out.println(mod1); //modulus operation

    }
}
