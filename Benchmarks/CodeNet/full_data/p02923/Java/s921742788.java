import java.util.*;


public class Main {
	public static void main (String[] args){
		Scanner sc =  new Scanner(System.in);
		int N = sc.nextInt();
		int H[] = new int[N];
		int sum = 0;
		for(int i = 0; i < N; i++) {
			H[i] = sc.nextInt();
		}
		for(int i = 0; i < N-1; i++) {
			int memo = 0;
			for(int j = i+1; j < N; j++) {
				if(H[i] >= H[j]) {
					i = j;
					memo++;
				}
				else {
					break;
				}
			}
			if(memo > sum) {
				sum = memo;
			}
		}
		System.out.println(sum);
	}	
}