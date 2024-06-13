package eularnumber;

public class EularNumber {

    public static double factorial(double sayi) {
        //this method created for calculate the factorial of a number (recursive method). 
        double fact;
        if (sayi > 1) {
            fact = factorial(sayi - 1) * sayi;
        } else {
            fact = 1;
        }
        return fact;
    }

    public static double findEulerNumber(double sayi) {
        double e = 0;
        for (int i = 0; i < sayi; i++) {
            e += 1 / factorial(i);
        }
        return e;
    }

    public static void main(String[] args) {

    }

}
