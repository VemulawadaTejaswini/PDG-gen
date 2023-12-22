import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] array = new int[a];
		int count = 0;
		int z = 0;
		for(int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		int i = 0;
		while(z <= b) {
			count++;
			z += array[i];
			i++;
		}
		System.out.println(count);
	}
}