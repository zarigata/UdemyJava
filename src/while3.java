import java.util.Scanner;

public class while3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int ex1 = sc.nextInt();
        while (ex1 != 2002){
            System.out.println("wrong password");
            ex1 = sc.nextInt();
        }


        System.out.println("gas tipe");
        int ex2 = sc.nextInt();
        int gas = 0;
        int alc = 0;
        int dis = 0;


        while (ex2 != 4){
            if (ex2 == 1){
                gas = gas + 1;
            }
            else if (ex2 == 2){
                alc = alc + 1;
            }
            else if (ex2 == 3){
                dis = dis + 1;
            }
            else if (ex2 >= 5){
                System.out.println("WRONG NUMBER");
            }
            ex2 = sc.nextInt();
        }

        System.out.println("gas" + gas);
        System.out.println("alc" + alc);
        System.out.println("dis" + dis );
        System.out.println("OPERATION DONE");
        sc.close();
    }
}
