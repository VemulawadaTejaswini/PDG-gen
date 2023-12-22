import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		int[] x = new int[a];

		int max = 0;
		int counter = -1;
		int answer = 0;
		for(int i =0; i<a; i++) {
			x[i] = sc.nextInt();

		}
		for(int i=0; i<a; i++) {
			if(x[i]>max)
			max = x[i];
			counter = i;
		}

		for(int i=0; i<a; i++) {
			if(i == counter) answer = answer + x[i]/2;
			else answer = answer + x[i];

		}

		System.out.print(answer);
	}

}
