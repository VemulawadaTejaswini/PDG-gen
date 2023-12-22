import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Integer L[] = new Integer[m];
        Integer R[] = new Integer[m];
        for (int i=0; i<m; i++) {
            L[i] = sc.nextInt();
            R[i] = sc.nextInt();
        }
        int kotae=0;
        for (int i=1;i<=n;i++){
            for (int j=0;j<m;i++)
                if (L[j] <= i && R[j] >= i) {
                    kotae += 1;
                }
        }
        System.out.println(kotae+"");
    }
}