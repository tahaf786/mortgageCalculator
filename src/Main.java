import java.text.NumberFormat;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Principle: ");
       double pA = scanner.nextDouble();
        System.out.println(pA);

        System.out.print("Annual Interest: ");
        double interest = scanner.nextDouble();
        System.out.println(interest);

        double r = (interest/100) / 12;

        System.out.print("Period: ");
        double period = scanner.nextDouble();
        System.out.println(period);

        double p = (period * 12) ;


        System.out.print("Mortgage: ");
        double Mortgage = pA * (
                (r) * (Math.pow((1 + r),p)) /  (Math.pow((1 + r),p) - 1)
                );
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(Mortgage);
        System.out.println(result);


        }




    }
