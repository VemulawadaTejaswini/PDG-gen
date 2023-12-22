import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double X = sc.nextInt();
        double Y = sc.nextInt();
        double Z = sc.nextInt();
        int T = 0;
        //double LO = Math.pow(X,Y);
        //Y = (Y - 1) * 4;


        //double STR = Y / LO;

        if (Z == 0) {
            System.out.println(Y / X);
        }else{
            System.out.println(1.0000000);
        }
    }
}
