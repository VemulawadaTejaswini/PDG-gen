import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int cl = 0;
        int ti;
        for (int i=0; i<n; i++) {
            ti = sc.nextInt();
            if ( ti < a || ti >= b ) {
                cl++;
            }
        }
        System.out.println(cl);
    }
}
