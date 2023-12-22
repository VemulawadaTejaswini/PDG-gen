import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] numbers = new int[N];
		for(int i = 0; i < N; i++) {
			numbers[i] = sc.nextInt();
		}

		int max = 0;
		int max2=0;
		boolean daburi = false;
		for(int i=0; i<N;i++) {
			if(numbers[i]==max) {
				daburi = true;
			}
			if(numbers[i]>max) {
				max2=max;
				max=numbers[i];
			}
			if(numbers[i]!=max && numbers[i]>max2) {
				max2=numbers[i];
			}
		}
		for(int i = 0; i < N; i++) {
			if(numbers[i]==max && !(daburi)) {
				System.out.println(max2);
			} else {
				System.out.println(max);
			}
		}
     }

	}