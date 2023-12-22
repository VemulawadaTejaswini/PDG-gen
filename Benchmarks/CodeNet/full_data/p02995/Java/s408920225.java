import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long D = sc.nextLong();
        long under = A-1;
        long ans1 = B/C + B/D;
        long ans2 = (A-1)/C + (A-1)/D;
        long c = C;
        long d = D;
        while (true) {
            long tmp = c%d;
            c = d;
            d = tmp;
            if (d == 0) {
                break;
            }
        }
        long sm = C*D/c;
        long ans3 = B - (ans1 - B/sm);
        long ans4 = (A-1) - (ans2 - (A-1)/sm);
        System.out.println(ans3-ans4);
    }
}