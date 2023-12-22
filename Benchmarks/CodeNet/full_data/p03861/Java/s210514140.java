import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String x = sc.next();
        long anum = Long.parseLong(a);
        long bnum = Long.parseLong(b);
        long xnum = Long.parseLong(x);

        System.out.println( (bnum/xnum) - ((anum - 1L)/xnum) );
    }
}
