import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int h  = stdIn.nextInt();
		int w = stdIn.nextInt();
		
		char[][]s = new char[h+2][w+2];
		
		for(int i = 1; i < h; i++) {
			s[i] = stdIn.next().toCharArray();
		}
		
		boolean flag = false;
		
		for(int i = 1; i <= h; i++) {
			for(int j = 1; j <=w; j++) {
				
				if(s[i][j]=='#' && s[i][j-1] == '.' && s[i][j+1] == '.' && s[i-1][j] == '.' && s[i+1][j] == '.') {
					flag = true;
				}
				
				
			}
		}
		
		if(flag) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
		
		
	}

}
