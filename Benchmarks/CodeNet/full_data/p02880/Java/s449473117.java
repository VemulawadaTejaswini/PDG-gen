//package atcoder;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
	        int N = in.nextInt();
	     
	        for(int  i=1;i<=9;i++){
	        		if( N % i == 0 ){
	        			int j = N / i;
	        			if( j>=1 && j<=9){
	        				System.out.println("Yes");
	        				return;
	        			}
	        		}
	        }
	        System.out.println("No");
	}

}
