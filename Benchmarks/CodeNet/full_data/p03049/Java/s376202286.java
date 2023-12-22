import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
//	 static int mod = 998244353;
   public static void main(String[] args) {
	   
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
//       int B = sc.nextInt();
//       String S = sc.next();
//       String T = sc.next();
//       char[] s = S.toCharArray();
//       char[] t = T.toCharArray();
       int f = 0;
       int l = 0;
       int fl = 0;
       int cnt=0;
       for (int i=0 ; i<N; i++) {
           String S = sc.next();
           char[] s = S.toCharArray();
           if(s[0]=='B'&& s[s.length-1]=='A') {
        	   fl++;
           } else if(s[0]=='B') {
        	   f++;
           } else if(s[s.length-1]=='A') {
        	   l++;
           }
           while(S.indexOf("AB")!=-1) {
        	   S=S.substring(S.indexOf("AB")+2);
        	   cnt++;
           }
       }
       int[] m = new int[3];
       m[0]=fl;
       m[1]=f;
       m[2]=l;
       Arrays.sort(m);
       if(m[0]!=0) {
    	   cnt=cnt+m[0]*2;
       }
       
       fl=fl-m[0];
       f=f-m[0];
       l=l-m[0];
       if(fl!=0) {
    	   cnt=cnt+fl-1;
    	   if(l!=f) {
    		   cnt++;
    	   }
       }
       cnt=cnt+Math.min(f, l);
       
       System.out.println(cnt);
   }
      

}