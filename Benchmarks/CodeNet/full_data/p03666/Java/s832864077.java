import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long A = sc.nextInt();
        long B = sc.nextInt();
        long C = sc.nextInt();
        long D = sc.nextInt();

        boolean flag = false;
        for (int i=0;i<N;i++) {
            long max = A-C*i+D*(N-1-i);
            long min = A-D*i+C*(N-1-i);
            if (min<=B && B<=max) flag=true;
        }

        if (flag) System.out.println("YES");
        else System.out.println("NO");
    }
}