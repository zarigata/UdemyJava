import java.util.Scanner;

public class doWhile {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);


        char resp = 's';
        do {
            System.out.print("digite temp em celcious");
            double C = sc.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0;
            System.out.printf("Equivalente a farehaint : %.2f%n", F);
            System.out.print("deseja repetir (S/N)? ");
            resp = sc.next().charAt(0);
        }while (resp != 'n');
        sc.close();

    }
}
