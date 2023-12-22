import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
      
        int count1 = 0;
        for(int i = 0 ; i < N; i++){
          a[i] = sc.nextInt();
          if(a[i] == 1){
            count1++;
          }
        }
      
       if(count1 == 0){
         System.out.println(-1);
         return;
       }
      
       int ans = 0;
       int num = 1;
       for(int i = 0 ; i < N; i++){
         if(a[i] == num){
           num++;
         }else{
           ans++;
         }
       }
        
        
          System.out.println(ans);
        
	}
}