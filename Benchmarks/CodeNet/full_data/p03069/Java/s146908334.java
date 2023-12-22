import java.util.*;
 
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, i;
		int bcount = 0, wcount = 0;
		String s;
		n = sc.nextInt();
		s = sc.next();
		char[] sArray = s.toCharArray();
        char[] ssArray = s.toCharArray();
		for(i = 0; i < n - 1; i++) {
			if(sArray[i] == '#') {
				if(sArray[i + 1] == '.') {
				    bcount++;
				    sArray[i] = '.';
				}
			}
		}
		
		for(i = 0; i < n - 1; i++) {
			if(ssArray[i] == '.') {
				if(ssArray[i + 1] == '#') {
				    wcount++;
				    ssArray[i] = '#';
				}
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