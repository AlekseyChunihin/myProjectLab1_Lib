import java.util.Scanner;

public class Main {
    private static Scanner in=new Scanner(System.in);

    public static void main(String[] args){
        testPower();
        testLog();
        testFactorial();
    }

    private static void testFactorial() {
        System.out.println("Факториал");
        System.out.println("Введите целое число");
        int a=in.nextInt();
        long f=MyMath.factorial(a);
        System.out.println("factorial("+a+")="+f);
    }

    private static void testLog() {
        System.out.println("Логарифмы");
        System.out.println("Введите число");
        double a=in.nextDouble();
        double lnA=MyMath.ln(a);
        double lgA=MyMath.lg(a);
        System.out.println("ln("+a+")="+lnA);
        System.out.println("lg("+a+")="+lgA);
    }

    private static void testPower() {
        System.out.println("Возведение в степень");
        System.out.println("Введите число");
        double a=in.nextDouble();
        System.out.println("Введите целую степень");
        int n=in.nextInt();
        double x=MyMath.power(a,n);
        System.out.println(a+" в степени "+n+"="+x);
    }


}
