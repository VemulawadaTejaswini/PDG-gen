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
        int ans = R[0]-L[m-1]+1;
        System.out.println(ans);
    }
}