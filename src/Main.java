import java.text.NumberFormat;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        double pA = 0;
        Scanner scanner = new Scanner(System.in);


       while (true){
           System.out.print("Principle ($1K - $1M): ");
           pA = scanner.nextDouble();
           if (pA >= 1_000 && pA <= 1000_000)
               break;
           System.out.println("Enter a number between 1,000 and 1,000,000");

       }
       double interest = 0;
       while(true) {

           System.out.print("Annual Interest: ");
           interest = scanner.nextDouble();
           System.out.println(interest);
           if (interest >= 1 && interest <= 30)
               break;
           System.out.println("Enter a value greater than 0 and less than equal to 30");
       }
           double r = (interest / 100) / 12;
       double period = 0;

       while(true) {

           System.out.print("Period: ");
           period = scanner.nextDouble();
           System.out.println(period);
           if (period >=1 && period <=30)
               break;
           System.out.println("Enter a value between 1 and 30");
       }
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
