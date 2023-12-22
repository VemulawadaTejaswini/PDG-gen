import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int g = 0;
        for (int n=1; n<=N; n++) {
            for (int num=n; num<=0; num -= 10000) {
                if (num>=0)
                    k++;
            }
            for (int num=n; num<=0; num -= 1000) {
                if (num>=0)
                    k++;
            }
            for (int num=n; num<=0; num -= 100) {
                if (num>=0)
                    k++;
            }
            for (int num=n; num<=0; num -= 10) {
                if (num>=0)
                    k++;
            }
            for (int num=n; num=0; num -= 1) {
                if (num=0)
                    k++;
            }
            if (k>=A && k<=B){
                g += 1;
            }
        }
        System.out.println(g);
    }
}
