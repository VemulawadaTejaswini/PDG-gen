import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        Arrays.sort(a);
        for(int i=0; i<m; i++) {
            int num = a[n-1-i];
            if(num * 4 * m < sum) {
                System.out.println("No");
                return;
            }

        }
        System.out.println("Yes");


    }
}