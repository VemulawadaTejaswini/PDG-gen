import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
      
        int[] a = new int[n];
        for(int i = 0 ; i < n; i++) {
          a[i] = sc.nextInt();
          
        }
      
        int max = 0;
      for (int j = 0 ; j < n; j++) {
        for (int i = 0; i < n; i++) {      
          if(i != j) {
            if(a[i] > max) {
              max = a[i];
            }
          }
        }
         System.out.println(max);
        max = 0;

      }            
          
    
    }
}