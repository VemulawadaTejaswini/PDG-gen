import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String str = sc.next();
		String[] strArray = str.split("");
		int count = 0;
		boolean flag =true;
		int preCount = 0;

			for (int i = 0; i <strArray.length-1; i++) {
				// System.out.print(strArray[i] + "+"+strArray[i+1]);
				// System.out.print(strArray[i].equals("B") );
				// System.out.println( strArray[i+1].equals("W") );
				if(strArray[i].equals("B") && strArray[i+1].equals("W")){
					strArray[i]= "W";
					strArray[i+1]= "B";
					count ++;
					i -=2;
					if(i<0){
						i=0;
					}
				}
			}
		System.out.println(count);




	}
}