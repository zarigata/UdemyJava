import java.util.Scanner;

public class forClass {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int nigg = sc.nextInt();
        int soma = 0;

        for (int i=0 ; i < nigg  ; i++ ){
            int x = sc.nextInt();
            soma = soma +1 ;

        }
        System.out.println(soma);
    }
}
