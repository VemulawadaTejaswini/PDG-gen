import java.util.*;
public class Main {
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
      
      String s = sc.next();
      int s1 = Integer.parseInt(s.substring(0,2));
      int s2 = Integer.parseInt(s.substring(2,4));
      boolean y1 = 0 < s1;
      boolean m1 = 0<s1&& s1<13;
      boolean y2 = 0 < s2;
      boolean m2 = 0<s2 && s2<13;
      String ans ="NA";
      if(y1 && y2 && m1 && m2){
        ans = "AMBIGUOUS";
      }else if(y1 && m2){
        ans = "YYMM";
      }else if(m1 && y2){
        ans = "MMYY";
      }

      // 出力
      System.out.println(ans);
	}
}