import java.util.*;


class Main{
    static long mod = 1000000007;
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        final long A = sc.nextLong();
        final long B = sc.nextLong();
        final long C = sc.nextLong();
        final long D = sc.nextLong();
        long count=B-A+1;

        count = count - (A%C == 0 ? B/C - A/C + 1 : B/C - A/C);
        count = count - (A%D == 0 ? B/D - A/D + 1 : B/D - A/D);
        long mi = Math.min(C, D);
        long ma = Math.max(C, D);
        long tmp = 0;
        while((tmp=ma%mi)!=0){
            ma = mi;
            mi = tmp;
        }
        long CD = C*D/mi;
        count = count + (A%CD == 0 ? B/CD - A/CD + 1 : B/CD - A/CD);
        System.out.println(count);
    }
}