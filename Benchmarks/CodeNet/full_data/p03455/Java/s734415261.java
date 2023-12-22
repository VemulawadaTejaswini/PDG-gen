import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String a = sc.next();
		String b = sc.next();
        int c = Integer.parseInt(a + b);
        int d = c/2;
      if((d*d) == c){
        System.out.println("yes");
      }else{
        System.out.println("no");}
	}
}