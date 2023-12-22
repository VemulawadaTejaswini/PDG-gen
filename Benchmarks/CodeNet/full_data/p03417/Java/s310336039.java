import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(n == 1 || m ==1 ) {
            int ans = Math.max(n, m);
            System.out.println(ans - 2);
            return;
        } else if(n == 2 || m == 2){
            int ans = Math.max(n, m);
            System.out.println(n * m - 4);
            return;
        } else {
            int ans = n * m - (n + n + m + m - 4);
            System.out.println(ans);
            return;
        }
    }
}