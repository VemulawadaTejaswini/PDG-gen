import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String str = sc.next();
		String[] strArray = str.split("");
		int count = 0;

		for (int i = strArray.length-2; i >= 0; i--) {
			// System.out.println(strArray[i] + "+"+strArray[i+1]);
			// System.out.println(strArray[i].equals("B") );
			// System.out.println( strArray[i+1].equals("W") );
			if(strArray[i].equals("B") && strArray[i+1].equals("W")){
				strArray[i]= "W";
				count ++;
			}
		}
		System.out.println(count);




	}
}