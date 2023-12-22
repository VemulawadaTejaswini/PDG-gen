import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 入力
		int a = sc.nextInt();
		String b = sc.nextLine();
	  if (a < 3200 && 2800 <= a){
	    System.out.println("red");
	  } else if (a < 5000 && 3200 <= a){
	    System.out.println(b);
	  }
	}
}
