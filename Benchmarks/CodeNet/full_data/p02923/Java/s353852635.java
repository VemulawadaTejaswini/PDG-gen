import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] height = new int[N];

		int anser =0;
		for(int i = 0; i<N;i++) {
			height[i] = sc.nextInt();
		}
		for(int i = 0; i<N;i++) {
			int count = 0;
			for(int num = i; num<N-1; num++) {
				if(height[num] >= height[num+1]) {
					count++;
				}else {
					break;
				}
			}
			anser = anser<=count? count:anser;

		}
		System.out.println(anser);

		}
	}