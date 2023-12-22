import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean[] array = new boolean[2000000000];
		int count = 0;
		for (int i = 0; i < N; i++) {
			int num = sc.nextInt();
			if (array[num]) array[num] = false;
			else array[num] = true;
		}
		for (boolean key : array) {
			if (key) count++;
		}
		System.out.println(count);
	}
}