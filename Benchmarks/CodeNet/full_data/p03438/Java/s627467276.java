import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        boolean ans = true;
        for (int i = 0; i < n; i++) {
            if(b[i] < a[i]){
                ans = false;
                break;
            }
        }
        if(ans) System.out.println("Yes");
        else System.out.println("No");
        sc.close();
    }

}
