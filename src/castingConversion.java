public class castingConversion {
    public static void main(String[] args) {

        double length=500.4444;       //when a variable of decimal(smaller data type) is declared
        long casting=(long) length;   //And larger type of data(long) is stored in the smaller data type(double)
        System.out.println(casting);   //Results is implicit casting.

        double amount=100.50;
        int price=(int)amount;     // when a decimal value was converted
        System.out.println(price);   //Then expected value becomes a whole number

    }
}
