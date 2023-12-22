import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        int digits = 0;
        long dsum = 0;
        for(int i=0; i<m; i++) {
            int d = sc.nextInt();
            long c = sc.nextLong();
            digits += c;
            dsum += c * d;
        }
        long res = digits - 1 + (dsum - 1)/9;

        System.out.println(res);
    }
}
