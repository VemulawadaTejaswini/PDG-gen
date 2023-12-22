import java.util.Arrays;
import java.util.Scanner;


public class Main {

	/*
	 * 余りの最大値を求める。
	 */
	public static void main(String[] args) {

		/*
		 * Scannerで値取得。
		 */
		Scanner sint = new Scanner(System.in);
		Scanner sStr = new Scanner(System.in);

		//値取得
		String str = sStr.next();
		int number = sint.nextInt();

		
		sint.close();
		sStr.close();
		
		StringBuilder strSum = new StringBuilder();

		for(int i = 0; i < number; i++) {
			strSum.append(str);
		}
		
		String stringSum = new String(strSum);
		
		String[] strs = stringSum.split("");
		
		int var = 0;
		for(int i =0; i < strs.length ; i++) {
			if(strs[i].equals(strs[i+1])) {
				strs[i+1]= "1";
				var++;
			}
			
			System.out.println(var);
		}
		

	}

}
