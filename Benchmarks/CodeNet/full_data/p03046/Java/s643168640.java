import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int k = sc.nextInt();
        int n = (int) Math.pow(2, m);
        int xor = 0;
        for (int i = 0; i < n; i++) xor = xor^i;
        xor = xor^k;
        if(k == 0){
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(i).append(" ");
            }
            for (int i = n -1; i >= 0; i--) {
                sb.append(i).append(" ");
            }
            System.out.println(sb.toString());
        }else if(n <= k || xor != k) {
            System.out.println(-1);
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                if(i != k) sb.append(i).append(" ");
            }
            sb.append(k).append(" ");
            for (int i = n -1; i >= 0; i--) {
                if(i != k) sb.append(i).append(" ");
            }
            sb.append(k);
            System.out.println(sb.toString());
        }
        sc.close();
    }

}
