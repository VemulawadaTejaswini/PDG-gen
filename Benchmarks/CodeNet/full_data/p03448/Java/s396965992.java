import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();

        int count = 0;
        for (int i=0; i<a; i++) {
            for (int j=0; j<b; j++) {
                int t = x - (i*500) - (j*100) /50;
                if (t >= 0 && t <= c) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
