import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long c = 0;
        if(k % 2 == 0){
            int f1 = k / 2;
            int f2 = ((n - f1) / k + 1);
            c += f2 * f2 * f2;
        }
        int f2 = ((n - k) / k + 1);
        c += f2 * f2 * f2;
        System.out.println(c);
    }


}


