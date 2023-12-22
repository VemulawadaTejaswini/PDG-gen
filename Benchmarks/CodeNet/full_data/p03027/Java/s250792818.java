import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		long n = in.nextLong();
        long nam = 1;
        long sum = 0;
        
      for(int i=0;i<n;i++){
        long x = in.nextLong();long y = in.nextLong();long z = in.nextLong();
        for(int j=1;j<=z;j++){
          nam *= x+(j-1)*y;
        }
        System.out.println(nam%1000003);
        nam = 1;
      }
      
        
     
	}
}