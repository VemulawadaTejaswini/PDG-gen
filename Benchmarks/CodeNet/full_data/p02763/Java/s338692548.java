import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static int[] ans;
//	 static int mod = 998244353;
   public static void main(String[] args) {
	   

	   Scanner sc = new Scanner(System.in);
       int  N = sc.nextInt();
       String S = sc.next();
       char[] c = S.toCharArray();       
       BIT[] M = new BIT[27];
       for(int i=0;i<27;i++) {
    	   M[i]=new BIT(N+1);
       }
       for(int i=0;i<N;i++) {
    	   M[(int)c[i]-'a'].add(i, 1);
       }
       
       int  Q = sc.nextInt();
       long[][] a = new long[Q][3];
       char[] s = new char[Q];
       for (int i=0 ; i<Q; i++) {
           a[i][0] = Long.parseLong(sc.next());
           a[i][1] = Long.parseLong(sc.next());
           if(a[i][0]==2)a[i][2] = Long.parseLong(sc.next());
           else s[i]= sc.next().charAt(0);
           
       }
       
       for(int i=0;i<Q;i++) {
    	   if(a[i][0]==1) {
    		   int tmp=(int)c[(int)a[i][1]-1]-'a';
        	   M[(int)c[(int)a[i][1]-1]-'a'].add((int)a[i][1]-1, -1);
        	   c[(int) a[i][1]-1]=s[i];
        	   M[(int)s[i]-'a'].add((int)a[i][1]-1, 1); 		   
    	   } else {
    		   int cnt=0;
    		   int tmp=0;
    		   for(int j=0;j<26;j++) {
    			   tmp=M[j].sum2((int)a[i][1]-2, (int)a[i][2]-1);
    			   if(tmp>0)cnt++;
    		   }
    		   System.out.println(cnt);
    	   }
       }

   }
   
}


class BIT{
	int[] m;
	int N;
	public BIT(int n) {
		m=new int[n+1];
		N=n;
	}
	
	public void add(int idx, int value) {
		for(int i=idx+1;i<N;i+=(i&-i)) {
			m[i]=m[i]+value;
		}
	}
	public int sum(int idx) {
		int x=0;
		for(int i=idx+1;i>0;i=i-(i&-i)) {
			x=x+m[i];
		}
		return x;
	}
	public int sum2(int a,int b) {
		int tmp=sum(a);
		int tmp2=sum(b);
		return sum(b)-sum(a);
	}
	
	
}