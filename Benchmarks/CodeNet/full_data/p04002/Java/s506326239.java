
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         long H=gi();
         long W=gi();
         long N=gi();
         Map<Integer,Map<Integer,Boolean>> m=new HashMap<Integer,Map<Integer,Boolean>>();
         long[] ans=new long[10];
         ans[0]=(H-2)*(W-2);
         for (int i=0; i<N;i++) {
        	 int a=gi();
        	 int b=gi();
        	 if(m.containsKey(a)) {
        		 m.get(a).put(b, true);
        	 } else {
        		 Map map=new HashMap<Integer,Boolean>();
        		 map.put(b, true);
        		 m.put(a, map);
        	 }


        	 for(int j=-1; j<2;j++) {
        		 for(int k=-1; k<2;k++) {
            		 int ad=a+j;
            		 int bd=b+k;
            		 if(ad>1 && ad<H && bd>1 && bd<W) {
            			 int c=0;
            			 for(int ii=-1; ii<2;ii++) {
                    		 for(int jj=-1;jj<2;jj++) {
                        		 int add=ad+ii;
                        		 int bdd=bd+jj;
                        		 if(add>0 && add<=H && bdd>0 && bd<=W) {
                        			 if(m.containsKey(add) && m.get(add).containsKey(bdd)) {
                        				 c++;
                        			 }
                        		 }
                        	 }
                    	 }
            			 if(c>0) {
            				 ans[c-1]--;
            				 ans[c]++;
            			 }
            		 }
            	 }
        	 }
         }

         for(int i=0; i<ans.length;i++) {
             System.out.println(ans[i]);
         }
     }

  // a^nをmodで割ったあまり
 	public static long modpow(long a, long n, long mod) {
 		long res=1;
 		while(n>0) {
 			if((n & 1) == 1) res=res*a%mod;
 			a=a*a%mod;
 			n=n>>1;
 		}

 		return res;
 	}

     // 文字列として入力を取得
     public static String gs() {
          return scanner.next();
     }

     // intとして入力を取得
     public static int gi() {
          return Integer.parseInt(scanner.next());
     }

     // longとして入力を取得
     public static long gl() {
          return Long.parseLong(scanner.next());
     }

     // doubleとして入力を取得
     public static double gd() {
          return Double.parseDouble(scanner.next());
     }
}