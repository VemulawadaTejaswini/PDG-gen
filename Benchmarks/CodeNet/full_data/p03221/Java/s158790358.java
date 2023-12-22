import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
//	 static int mod = 998244353;
   public static void main(String[] args) {
	   
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int M = sc.nextInt();
       
       Long[][] m = new Long[(int)M][4];
       for (int i=0 ; i<M; i++) {
           m[i][0] = (long) i;
           m[i][1] = sc.nextLong();
           m[i][2] = sc.nextLong();
       }
       
       Arrays.sort(m, (b, c) -> Long.compare(b[1]*1000000000+b[2], c[1]*1000000000+c[2]));
       int cnt=1;
       for(int i=0;i<M;i++) {
    	   if(i==0||m[i][1]!=m[i-1][1]) {
    		   cnt=1;
    	   }
    	   m[i][3]=(long) cnt;
    	   cnt++;
       }

       Arrays.sort(m, (b, c) -> Long.compare(b[0], c[0]));
       for(int i=0;i<M;i++) {
    	   System.out.println(String.format("%06d",m[i][1]) + String.format("%06d",m[i][3]));
       }
   }
}