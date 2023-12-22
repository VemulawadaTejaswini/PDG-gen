import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		String s = sc.next();

		char[] c = s.toCharArray();
		
		int wc = 0;
		
		for(char ch : c) if(ch == '.') wc++;
		
		int res = 0;
		
		for(int i = 0; i < n - 1; i++){
			if(c[i] == '#' && c[i + 1] == '.'){
				c[i] = '.';
				res++;
				if(i == 0) i--; else i-=2;
			}
		}
		
		
		
		System.out.println(Math.min(res, wc));
	}
}
