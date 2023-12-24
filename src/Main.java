import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Good Morning");
        double y = 32.15321812;
        System.out.printf("%.3f%n", y);
        System.out.printf("%.4f%n", y);
        Locale.setDefault(Locale.US);
    }

}