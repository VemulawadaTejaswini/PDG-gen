import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int array[] = new int[N];
		for(int i = 0; i < N; i++) {
			int h = sc.nextInt();
			array[h-1] = i+1;
		}
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}

}
