
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         long N=gl();
         long P=gl();
         List<Long> l=insuB(P);

         Map<Long,Integer> m=new HashMap<Long,Integer>();
         for (int i=0; i<l.size();i++) {
        	 long v=l.get(i);
        	 if(m.containsKey(v)) {
        		 m.put(v, m.get(v)+1);
        	 } else {
        		 m.put(v, 1);
        	 }
         }

         long ans=1;
         for(Map.Entry<Long,Integer> e:m.entrySet()) {
        	 long v=e.getKey();
        	 long num=e.getValue();
        	 while(num>=N) {
        		 num-=N;
        		 ans*=v;
        	 }
         }
         System.out.println(ans);
     }

  // 素因数分解
 	public static List<Long> insuB(long n) {
 		List<Long> l=new ArrayList<Long>();
 		long i=2;
 		while(i*i<=n) {
 			if (n%i==0) {
 				l.add(i);
 				n/=i;
 			} else {
 				i++;
 			}
 		}
 		if(n!=1)l.add(n);
 		return l;
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