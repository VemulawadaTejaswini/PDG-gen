import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		int n = s.length();
		
		char lr[] = new char[n];
		
		for (int i = 0 ; i <n ; i ++) {
			
			lr[i] = s.charAt(i);
		}
		
		int ch[] = new int [n];
		for (int i = 0 ; i < n ; i ++) {
			ch[i] = 0;
			if (lr[i] == 'R') {
				
				int count = 1;
				
				boolean same = true;
				
				while (same){
					if (lr[i+count] == 'R') {
						count++;
					}else {
						
						same = false;
					};
				};
				
				if ((count)%2 == 0) {
					ch[i + count]++;
					
				}else {
					ch[i+ count -1]++ ;
				};
			}else {
				int count = 1;
				boolean same = true;
				while (same){
					if (lr[i-count] == 'L') {
						count++;
					}else {
						
						same = false;
					};
				};
				if ((count)%2 == 0) {
					ch[i - count]++;
				}else {
					ch[i- count +1] ++ ;
				};
			}
		}
		String re = "";
		for (int i = 0 ; i < n-1 ; i ++) {
			re  += ch[i]+" ";
		}
		re += ch[n-1];
		System.out.println(re);	
	}		
}