import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int [n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int x = 0;
        int y = 0;
        for(int i = n-1; i >= 1; i--) {
            if( a[i] == a[i-1] ) {
                if(x == 0) {
                    x = a[i];
                    i--;
                } else {
                    y = a[i];
                    break;
                }
            }
        }
        System.out.println(x*y);
    }
}