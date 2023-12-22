
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int count[] = new int[100001];
		
		for(int i = 0; i < n; i++) {
			count[sc.nextInt()]++;
		}
		
		//Arrays.sort(count);
		int remain = 0;
		int kind = 0;
		
		for(int i = 1; i < count.length; i++) {
			if(count[i] >= 1) {
				kind++;
				remain += count[i] - 1;
			}
		}
	
		if(remain % 2 == 0) {
			System.out.println(kind);
		}
		else {
			System.out.println(kind - 1);
		}
	}

}
