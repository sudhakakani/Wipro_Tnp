class Calculator {

    static int powerInt(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }

    static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("Power Int = " + Calculator.powerInt(2, 5));
        System.out.println("Power Double = " + Calculator.powerDouble(2.5, 3));

    }
}