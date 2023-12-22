import java.util.Scanner;

import javax.sql.rowset.serial.SerialArray;

public class Main {

		public static void main(String[] args){
			
			Scanner sc = new Scanner(System.in);

			
			int X = sc.nextInt();

			int ans = 0;
//			for (i = X;i = 0;i--;){
			Double d =  Math.sqrt(X);
				ans = (int) Math.floor(d);
			double value = Math.log(X) / Math.log(2);
			ans = (int) Math.floor(d);
			ans = (int) Math.pow(ans, 2);
//				if(ans <= d){
				    System.out.println(ans);
//				    return ;
				}
//			}
			
}
