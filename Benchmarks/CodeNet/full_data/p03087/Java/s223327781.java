import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int q = sc.nextInt();

      String s = sc.next();
      int[] prefixCnt = new int[n];
      for(int i = 1; i < prefixCnt.length; i++) {
        if(s.charAt(i) == 'C' && s.charAt(i-1) == 'A')
          prefixCnt[i] = prefixCnt[i-1] + 1;
        else
          prefixCnt[i] = prefixCnt[i-1];
      }

      for(int i = 0; i < q; i++) 
        System.out.println(-prefixCnt[sc.nextInt()-1] + prefixCnt[sc.nextInt()-1]);
  }
}