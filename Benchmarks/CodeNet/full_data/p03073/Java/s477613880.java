import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		int N = S.length();
		char[] C = S.toCharArray();
		char A0 = '0';
		char A1 = '1';
		int count0 =0;
		int count1 = 0;
		for(int i=0; i<N; i++) {
			if( C[i]!=A0){
				count0++;            	
            }
			if(A0=='0') {
				A0 ='1';
			}else {
				A0 ='0';
			}
			if( C[i]!=A1){
				count1++;            	
            }
			if(A1=='0') {
				A1 ='1';
			}else {
				A1='0';
			}
		}
		System.out.println(Math.min(count0,count1));
	}		
}