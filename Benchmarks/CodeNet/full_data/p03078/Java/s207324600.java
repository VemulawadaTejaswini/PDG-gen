import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
//	 static int mod = 998244353;
   public static void main(String[] args) {
	   
       Scanner sc = new Scanner(System.in);
       int X = sc.nextInt();
       int Y = sc.nextInt();
       int Z = sc.nextInt();
       int K = sc.nextInt();
//       int B = sc.nextInt();
//       String S = sc.next();
//       String T = sc.next();
//       char[] s = S.toCharArray();
//       char[] t = T.toCharArray();
       
       long[] a = new long[(int)X];
       for (int i=0 ; i<X; i++) {
           a[i] = sc.nextLong();
       } 
       long[] ab=new long[X*Y];
       long[] b = new long[(int)Y];
       for (int i=0 ; i<Y; i++) {
           b[i] = sc.nextLong();
           for(int j=0;j<X;j++) {
        	   ab[i*Y+j]=a[j]+b[i];
           }
       }
       Arrays.sort(ab);
       long[] c = new long[(int)Z];
       for (int i=0 ; i<Z; i++) {
           c[i] = sc.nextLong();
       } 
       Arrays.sort(c);
	   long right=30000000001l;
	   long left=-1;
	   while(right-left>1) {
		   long mid=left+(right-left)/2;
		   long cnt=0;
		   for(int i=0;i<X*Y;i++) {
			   int lw=-1;
			   int up=Z;
			   while(up-lw>1) {
				   int ave=lw+(up-lw)/2;
				   if(ab[i]+c[ave]>=mid)up=ave;
				   else lw=ave;
			   }
			   cnt=cnt+Z-up;
		   }
		   if(cnt<K) right=mid;
		   else left=mid;
	   }
       
	   long[] max=new long[5000];
	   Arrays.fill(max, left);
	   int cnt=0;
	   for(int i=0;i<X*Y;i++) {
		   int lw=-1;
		   int up=Z;
		   while(up-lw>1) {
			   int ave=lw+(up-lw)/2;
			   if(ab[i]+c[ave]>left)up=ave;
			   else lw=ave;
		   }
		   for(int k=up;k<Z;k++) {
			   max[cnt]=ab[i]+c[k];
			   cnt++;
		   }
	   }
       
	   Arrays.sort(max);
	   StringBuffer ans = new StringBuffer();
	   for(int i=0;i<K;i++) {
		   ans.append(max[4999-i]);
		   ans.append("\n");
	   }
	   System.out.println(ans);
   }
   
   public static boolean IsOk(long mid) {
	   return true;
   }
   
}
