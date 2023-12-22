import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int result = 0;
        int max =0;
      
        for (int i = 0; i < n; i++) {
           
          a[i] = sc.nextInt();
          if (max < a[i]) {
            max = a[i];
          }
        }
        
      	for (int i = max; i>0; i--) {
            int number = 0;
            for (int j = 0; j < n; j++) {
            	if (a[j] % i == 0) {
                	number++;
                }
            }
            if (number == n-1) {
              result = i;
            }
        }
        System.out.println(result);
        sc.close();
    }
 
}