import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
		String s = sc.next();

      // スペース区切りの整数の入力
		int length=s.length();
		// 出力
		//System.out.println(s.charAt(0)+length-2+s.charAt(length-1));
	System.out.print(s.charAt(0));
      System.out.print(length-2);
      System.out.print(s.charAt(length-1));
      }
}