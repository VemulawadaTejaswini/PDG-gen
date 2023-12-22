import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String[] strings = new String[N];
		
		for(int i=0; i<N; i++) {
			String s = sc.next();
			char[] c = s.toCharArray();
			Arrays.sort(c);
			strings[i] = new String(c);
		}
		
		int count = 0;
		for(int i=0;i<N-1;i++) {
			String begin = strings[i];
			for(int p=1;i+p<N;p++) {
				String compare = strings[i+p];
				if(begin.equals(compare)) {
					count++;
				}
			}
		}
		System.out.println(count);
		
		sc.close();	
	}
}