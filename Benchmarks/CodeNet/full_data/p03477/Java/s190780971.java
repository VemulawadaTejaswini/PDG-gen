import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ouput:1以上 N以下の整数のうち、各桁の和が A 以上 B 以下であるものの総和
		
		//input:
			//整数N
			//整数A
			//整数B
		
		//logic
		//approach1
		//文字列としてのNについて、各桁をそれぞれ「数字に変換」
		//A,Bは「数字」として変換
		
		//input
		int N=0;
		int A=0,B=0;
		int digit_sum = 0;
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		
		A = scan.nextInt();
		B = scan.nextInt();
		
		//check
		if(A > 36 || B > 36) return;
		if(A < 1 || B < 1) return;	
		if(N > 10000 || N < 1) return;
		
		//logic
		for(int i=1;i<N+1;i++) {
			String s_N = String.valueOf(i);
			
			for (int j = 0; j < s_N.length() ;j++) {
				//各桁の和
				int tmp = Character.getNumericValue(s_N.charAt(j));
				digit_sum = digit_sum + tmp;
				
				
			}
			if(digit_sum >= A && digit_sum <= B) sum = sum + i;
			//リセット
			digit_sum = 0;
		}
		
		System.out.println(sum);
	}

}