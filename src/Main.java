import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Good Morning");
        double y = 32.15321812;
        int x = 64;
        System.out.printf("%.3f%n", y);
        System.out.printf("%.4f%n", y);
        Locale.setDefault(Locale.US);
        System.out.printf("TOTAL = %d meters%n", x);

        String name = "Heinseberg";
        int age = 64;
        double money = 1200000000.0;
        System.out.printf("%s has %d years and owns U$ %.2f dollars" , name , age , money);
        // EX de fixacao
        String product1 = "computer";
        String product2 = "Office Desk";

        int ageF = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products");
        System.out.printf("%s , witch the price is %f", product1 , price1);
        System.out.printf("%s , witch the price is %f", product2 , price2);

        System.out.printf("Record: %d ");

    }

}