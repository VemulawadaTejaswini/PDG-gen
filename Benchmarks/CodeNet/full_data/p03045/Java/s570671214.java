import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
//	 static int mod = 998244353;
   public static void main(String[] args) {
	   
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int M = sc.nextInt();
//       String S = sc.next();
//       char[] c = S.toCharArray();
       
       Integer[][] a = new Integer[M][2];
       for (int i=0 ; i<M; i++) {
    	   int a1= sc.nextInt()-1;
    	   int b1= sc.nextInt()-1;
    	   int c1= sc.nextInt();
           a[i][0] = Math.min(a1, b1);
           a[i][1] = Math.max(a1, b1);
       }
       Arrays.sort(a, (b, c) -> Integer.compare(b[0], c[0]));
       int[] m=new int[N];
       
       long ans=N;
       int cnt=0;;
       for(int i=0;i<M;i++) {
    	   if(m[a[i][0]]!=0) {
    		   m[a[i][1]]=m[a[i][0]];
    	   } else if(m[a[i][1]]!=0) {
    		   m[a[i][0]]=m[a[i][1]];
    	   } else {
    		   cnt++;
    		   m[a[i][0]]=cnt;
    		   m[a[i][1]]=cnt;
    	   }
       }
       for(int i=0;i<N;i++) {
    	   if(m[i]==0)cnt++;
       }
       System.out.println(cnt);
   }
      

}