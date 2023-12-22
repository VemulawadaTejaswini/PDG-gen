import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int number = sc.nextInt();
		int[] values = new int[number];
		int[] costs = new int[number];
		int sum = 0;
		
		for(int i=0;i<number;i++)
			values[i] = sc.nextInt();
		for(int i=0;i<number;i++) {
			costs[i] = sc.nextInt();
			if(values[i]-costs[i]>0)
				sum += values[i]-costs[i];
		}
		sc.close();
		System.out.println(sum);
	}
}