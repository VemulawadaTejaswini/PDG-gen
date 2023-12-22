import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String[] strings = new String[N];
		for(int i=0; i<N; i++) {
			strings[i] = sc.next();
		}
		
		int count = 0;
		for(int i=0;i<N-1;i++) {
			String begin = strings[i];
			for(int p=1;p<N-i;p++) {
				String compare = strings[i+p];
				if(compareStrings(begin, compare)) {
					count++;
				}
			}
		}
		System.out.println(count);
		sc.close();	
	}
	
	public static boolean compareStrings(String begin , String compare) {
		String beginLocal = begin;
		String compareLocal = compare;
		boolean flag = true;
		while(true) {
			String beginChar = beginLocal.substring(0, 1);
			
			beginLocal = beginLocal.replace(beginChar, "");
			compareLocal = compareLocal.replace(beginChar, "");
			
			if(beginLocal.length() != compareLocal.length()) {
				flag = false;
				break;
			}
			if(beginLocal.length() == 0) {
				break;
			}
		}		
		return flag;
	}
}