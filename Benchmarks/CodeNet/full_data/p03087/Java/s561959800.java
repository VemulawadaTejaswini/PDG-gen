import java.util.*;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int Q = sc.nextInt();
      String S = sc.next();
      System.out.println();
      int l;
      int r;
      for(int i=0;i<Q;i++){
        l = sc.nextInt();
        r = sc.nextInt();
        String s = S.substring(l-1,r).replaceAll("AC", "a");
        String[] ar = s.split("");
        long n = Arrays.stream(ar).filter(z->"a".equals(z)).count();
        System.out.println(n);
      }
	}
}