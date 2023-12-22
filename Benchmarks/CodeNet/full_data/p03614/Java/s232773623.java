
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int N=gi();
         int[] p=new int[N];

         boolean bf=false;
         long ans=0;
         for (int i=0; i<N;i++) {
            p[i]=gi();
            if (p[i]==i+1) {
            	if(!bf) {
            		ans++;
            		bf=true;
            	} else {
            		bf=false;
            	}
            } else {
            	bf=false;
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