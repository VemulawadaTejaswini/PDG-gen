import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] plice;
        plice = new int[n];
      
        for (int i = 0; i < n; i++) {
          plice[i] = sc.nextInt();
        }

      
        for (int i = 0; i < m; i++) {
          Arrays.sort(plice);
          plice[n-1] = plice[n-1] / 2;
        }
      
        long sum = 0;
        for (int i = 0; i < n; i++) {
          sum += plice[i];
        }
      System.out.println(sum);
    }
}   