
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int N=gi();
         long[] b=new long[N];

         long ans=0;
         for (int i=0;i<N;i++) {
        	 b[i]=gl();
         }
         Arrays.parallelSort(b);

         Deque<Long> q=new ArrayDeque<Long>();
         for (int i=0; i<N;i++) {
        	 q.addFirst(b[i]);
         }

         boolean f=true;
         long bv=q.pollFirst();
         long nv=0;
         while(q.size()>1) {
        	 if(f) {
        		 nv=q.pollLast();
        	 } else {
        		 nv=q.pollFirst();
        	 }
    		 ans+=Math.abs(nv-bv);
    		 bv=nv;
        	 f=!f;
         }
         System.out.println(Math.max(ans+(b[N-1]-q.peek()), ans+Math.abs(bv-q.peek())));

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