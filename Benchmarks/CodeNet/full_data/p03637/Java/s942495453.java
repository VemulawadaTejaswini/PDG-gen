import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int f = 0, t = 0, o = 0;
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            long a = in.nextLong();
            if (a % 4 == 0) {
                f++;
            } else if (a % 2 == 0) {
                t++;
            } else {
                o++;
            }
        }
        if(f > 0) {
            if(o < f || f == o || (o == f + 1 && t == 0)) {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }else {
            if(o == 0 && t > 1) {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
