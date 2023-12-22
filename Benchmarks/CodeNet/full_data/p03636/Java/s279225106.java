import java.util.Scanner;

import javax.sql.rowset.serial.SerialArray;

public class Main {

		public static void main(String[] args){
			
			Scanner sc = new Scanner(System.in);
			// 整数の入力
			// スペース区切りの整数の入力
			String str = sc.next();
			String[] strArray = str.split("");
		 
			System.out.println(strArray[1].toString() 
                                             + (strArray.length - 3) + strArray[strArray.length - 1].toString());

		}
}
