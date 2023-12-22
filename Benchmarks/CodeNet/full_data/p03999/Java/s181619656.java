import java.util.*;
 
public class Main{
 
	public static void main(String[] args){
 
		Scanner sc = new Scanner(System.in);
        String S = sc.next();
        long s = Long.parseLong(S);
        char[] list = S.toCharArray();
        long[] a = new long[list.length];
        
      long ans = 0;
      for(int i = 0 ; i < list.length; i++){
        long next = Character.getNumericValue(list[i]);
        a[i] = next;
        ans += next;
      }
      
      
          
      
      for(int j = 1; j < a.length-1; j++){
        long kakeru = (long)Math.pow(10,j);
        for(int k = 0; k < a.length-1; k++){
          long b = a[k]*kakeru;
          ans += b;
          if(k != 0){
            for(int l = 0; l < k; l++){
              ans += a[l];
            }
          }
          for(int p = k+1; p < a.length; p++){
            ans += a[p];
          }
        }
      }
       
      System.out.println(ans+s);
          
   }
}