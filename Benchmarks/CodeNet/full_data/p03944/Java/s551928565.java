import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintStream out = new PrintStream(System.out);
        int W, H, N;

        W = sc.nextInt();
        H = sc.nextInt();
        N = sc.nextInt();

        int x, y, a, x_min = W, x_max = 0, y_min = H, y_max = 0;
        for (int i = 0; i < N; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            a = sc.nextInt();

            switch (a) {
                case 1:
                    if (x_max < x ) {
                        x_max = x;
                    }
                    break;
                case 2:
                    if (x_min > x ) {
                        x_min = x;
                    }
                    break;
                case 3:
                    if (y_max < y ) {
                        y_max = y;
                    }
                    break;
                case 4:
                    if (y_min > y ) {
                        y_min = y;
                    }
                    break;
                default:
                    break;
            }
        }
        
        if ((x_min - x_max)*(y_min - y_max) > 0) {
            out.println((x_min - x_max)*(y_min - y_max));
        } else {
            out.println(0);
        }
        
        sc.close();
    }
}