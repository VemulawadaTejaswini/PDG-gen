import java.util.*;
import java.util.Map.Entry;
 
 

class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
   public static void main(String[] args) {
	   
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       String ans="APPROVED";
       
       String[] s = new String[(int)N];
       for (int i=0 ; i<N; i++) {
           s[i] = sc.next();
       }
       
       Arrays.sort(s);
       
       String[] t = new String[N];
       int[] cnt = new int[N];
       int tmp=-1;
       int max=0;
       for (int i=0 ; i<N; i++) {
    	   if(i==0||!s[i].equals(s[i-1])) {
    		   tmp++;
    		   t[tmp]=s[i];
    		   cnt[tmp]=1;
    	   } else {
    		   cnt[tmp]++;
    	   }
		   max=Math.max(max, cnt[tmp]);
       }
       
       for(int i=0;i<tmp+1;i++) {
    	   if(cnt[i]==max) {
    		   System.out.println(t[i]);
    	   }
       }
       
   }

}