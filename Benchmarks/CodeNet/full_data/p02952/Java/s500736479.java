import java.util.*;
public class Main {
	public static void main(String[]args) {
		/*整数Nが与えられます。N 以下の正の整数のうち、(先頭に0をつけずに十進法で表記したときの) 桁数が奇数であるようなものの個数を求めてください。*/
		
		Scanner sc = new Scanner(System.in);
		
		Integer N = sc.nextInt();
		sc.close();
		
		int result = 0;
		
		for (int i = 1; i <= N;i++) {
			String test  = Integer.toString(i);
		
			if (test.length()%2 != 0) result++;
		
		}
		
		System.out.println(result);

	}

}
				
				
			