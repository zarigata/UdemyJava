import java.util.Scanner;

public class while2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int x = 2000;
        int y = 0;

        while (x > 1)
        {
            System.out.println(x);
            System.out.println(y);
            y = y + 1;
            x = x - 1;
        }

        System.out.println("OPERATION DONE");
        sc.close();
    }
}
