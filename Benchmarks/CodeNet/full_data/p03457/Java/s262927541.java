
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int n = sc.nextInt();
        int x = 0;
        int y = 0;
        int t = 0;
        String res = "Yes";
        for(int i=0; i<n ;i++) {
            int ti = sc.nextInt();
            int xi = sc.nextInt();
            int yi = sc.nextInt();

            int d = Math.abs(xi - x) + Math.abs(yi - y);
            int dt = ti - t;
            if(d > dt || (d % 2) != (dt % 2)) {
                res = "No";
                break;
            }
            t = ti;
            x = xi;
            y = yi;
        }
        System.out.println(res);
    }

}
