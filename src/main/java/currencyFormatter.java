import java.util.*;
import java.text.*;

public class currencyFormatter {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the value to be formatted: ");
            double payment = scanner.nextDouble();
            scanner.close();

            //initialize objects to create manually
            Locale indiaLocale = new Locale("en", "IN");
            Locale brasilLocale = new Locale("pt","BR");

            NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
            NumberFormat indiaFormate = NumberFormat.getCurrencyInstance(indiaLocale);
            NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
            NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
            NumberFormat brasilFormat = NumberFormat.getCurrencyInstance(brasilLocale);

            String us = usFormat.format(payment);
            String india = indiaFormate.format(payment);
            String china = chinaFormat.format(payment);
            String france = franceFormat.format(payment);
            String brasil = brasilFormat.format(payment);

            System.out.println("US: " + us);
            System.out.println("India: " + india);
            System.out.println("China: " + china);
            System.out.println("France: " + france);
            System.out.println("Brasil: " + brasil);

        }

}
