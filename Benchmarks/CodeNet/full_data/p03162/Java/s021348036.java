import java.util.*;

public class Main {
    public static void main(String Args[]) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        long a = 0, b = 0, c = 0, sum = 0;
        int d = -1;
        for (int i = 0; i < n; i++) {
            a = ob.nextInt();
            b = ob.nextInt();
            c = ob.nextInt();
            if (d == 0) {
                sum += Math.max(b, c);
                if (b > c)
                    d = 1;
                else
                    d = 2;
            } 
            else if (d == 1) {
                sum += Math.max(a, c);
                if (a > c)
                    d = 0;
                else
                    d = 2;
            } 
            else if (d == 2) {
                sum += Math.max(a, b);
                if (b > a)
                    d = 1;
                else
                    d = 0;
            } 
            else {
                sum += Math.max(a, Math.max(b, c));
                if (a > c && a > b)
                    d = 0;
                else if (b > c&& b>a)
                    d = 1;
                else if(c>a&&c>b)
                    d = 2;
            }
        }
        System.out.println(sum);
        ob.close();
    }
}