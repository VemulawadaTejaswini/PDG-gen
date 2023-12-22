import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		for(int i = 0; i < 5; i++)
			array[i] = sc.nextInt();
		
		int min = 10;
		int sum = 0;
		for(int i =0; i < 5; i++) {
			sum += roundUp(array[i]);
			if(min > array[i] % 10 && array[i] % 10 != 0)
				min = array[i] % 10;
		}
		if(sum >= 10)
			sum -= 10;
		sum += min % 10;
		System.out.println(sum);
	}
	
	public static int roundUp(int i) {
		if(i % 10 != 0) 
			return (i /10 + 1) * 10;
		else
			return i;
	}
}