import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        String s1=sc.next();
        s1=s1.toUpperCase();
        String s2=sc.next();
        s2=s2.toUpperCase();
        String s3=sc.next();
        s3=s3.toUpperCase();
        char[] S1=s1.toCharArray();
        char[] S2=s2.toCharArray();
        char[] S3=s3.toCharArray();
        System.out.print(S1[0]);
        System.out.print(S2[0]);
        System.out.print(S3[0]);
        System.out.println();
    }
}
