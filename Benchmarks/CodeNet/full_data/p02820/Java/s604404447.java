

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int N=gi();
         int K=gi();
         int R=gi();
         int S=gi();
         int P=gi();
         String T=gs();
         Map<Character,Integer> m=new HashMap<Character,Integer>();
         m.put('r', P);
         m.put('s', R);
         m.put('p', S);
         m.put('n', -1);

         int ans=0;
         List<Boolean> l=new ArrayList<Boolean>();
         for (int i=0; i<N;i++) {
        	 char c=T.charAt(i);
        	 char cmk='n';
        	 if(i-K>=0)cmk=T.charAt(i-K);
        	 if(c!=cmk || !l.get(i-K)) {
        	     if(c=='r') {
        		     ans+=P;
        	     } else if(c=='s'){
        		     ans+=R;
        	     } else {
        		     ans+=S;
        	     }
        	     l.add(true);
        	 } else {
        		 l.add(false);
        	 }

         }


         System.out.println(ans);
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