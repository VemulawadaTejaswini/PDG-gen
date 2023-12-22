import java.math.BigInteger;
import java.util.Scanner;

public class Main {

		public static void main(String[] args){
			
			Scanner sc = new Scanner(System.in);
			// 文字列の入力
			String S = sc.next();
			BigInteger K = sc.nextBigInteger();
			String[] strArray = S.split("");
			
			BigInteger cnt = new BigInteger("0");
			BigInteger D1 = new BigInteger("1");

			for(int i = 0;i<strArray.length;i++){
				if(strArray[i].equals("1")){
					cnt = cnt.add(D1);
				}
			}

			if(K.compareTo(cnt) == 0){
			    System.out.println(strArray[0]);
		   		sc.close();
			    return ;
			}
			if(strArray[0].equals("1")){
			    System.out.println(strArray[1]);
			}else{
			    System.out.println(strArray[cnt.subtract(D1).intValue()]);
			}
	   		sc.close();
		    return ;

		}
}
