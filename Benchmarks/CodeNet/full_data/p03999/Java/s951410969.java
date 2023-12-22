import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);;
		
		String s = sc.next();
		char []c = s.toCharArray();
		
		int p = s.length();
		int N = (int)Math.pow(2, p-1);
		long ans = 0;
		long tmp = c[0] - '0';
		
		for(int i = 0; i < N ; i++) {
			for(int j = 0; j < p-1; j++) {
				if(((1 & i >> j) == 1)){
					ans += tmp;
					tmp = c[j+1] - '0';
				}
				if((1 & i >> j) == 0 ){
					tmp = tmp * 10;
					tmp += c[j+1] - '0';
				}
			}
			ans += tmp;
			tmp = c[0] - '0';
		}
		System.out.println(ans);
					  
		  }
	}