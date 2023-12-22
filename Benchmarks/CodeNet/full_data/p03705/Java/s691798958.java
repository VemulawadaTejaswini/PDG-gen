

import java.math.BigInteger;
import java.util.Scanner;



public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			
			int N = sc.nextInt();
			int A = sc.nextInt();
			int B = sc.nextInt(); 
			
			if(A>B||(N==1&&(A!=B))) {
				System.out.println(0);
			}else
			
			if(A==B&&N==1) {
				System.out.println(1);
			}
			else {
				
				
				int space = N - 2; 
				int num = B - A + 1;
				
				BigInteger numN = nm(num,space);
				int te = num/2;
				BigInteger rz = numN.subtract(BigInteger.valueOf(te));
				System.out.println(rz);
			}
			
		}
	}
	
	public static BigInteger nm(int a,int b) {
		BigInteger rz = BigInteger.valueOf(1);
		for (int i = a; i >= b; i--) {
			rz = rz.multiply(BigInteger.valueOf(i));
		}
		return rz;
	}

}
