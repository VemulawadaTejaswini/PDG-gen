import java.io.File;
import java.util.Scanner;


public class ABC {
	 public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			// 整数の入力
			String input1 = sc.next();
			String input2 = sc.next();
			int a = new Integer(input1).intValue();
			int b = new Integer(input2).intValue();
			
				if(a == b) System.out.println("EQUAL");
				if(a>b)System.out.println("GREATER");
				if(a<b)System.out.println("LESS");
		  }

}
