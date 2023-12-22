import java.util.Scanner;


public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, i;
		int fcount = 0, bcount = 0, wcount = 0;
		n = sc.nextInt();
		char[] sArray = sc.next().toCharArray();
 
		for(i = 0; i < n; i++) {
			if(sArray[i] == '#') {
				fcount = 1;
				bcount++;
			}
			if(sArray[i] == '.' && fcount == 1) {
				wcount++;
			}
		}
		if(bcount < wcount) {
			System.out.println(bcount);
		}else {
			System.out.println(wcount);
		}
		sc.close();
	}
}