import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int n = sc.nextInt();
        long t = sc.nextLong();
        long a = sc.nextLong();
        long nt = 0,na = 0;
        for (int i = 1;i < n;i++) {
            nt = sc.nextLong();
            na = sc.nextLong();
            long m = Math.max((t-1)/nt+1,(a-1)/na+1);
            t = nt*m;
            a = na*m;
        }
        
        System.out.println(t+a);
    }
}
