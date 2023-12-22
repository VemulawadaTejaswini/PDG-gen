import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        for(int i = 1; i <= n; i++) {
            int num = sc.nextInt();
            a[i] = num;
        }
        int count = 0;
        int[] b = new int[n+1];
        for(int i = n; i >= 1; i--) {
          int sum = 0;
          int j = i + i;
          while(j <= n) {
            sum += b[j];
            j += i;
          }
          if(sum % 2 != a[i]) {
            b[i] = 1;
            count++;
          }
          else b[i] = 0;
        }
        System.out.println(count);
      for(int i = 1; i <= n; i++) {
        if(b[i] == 1) System.out.print(i + " ");
      }
    }
}