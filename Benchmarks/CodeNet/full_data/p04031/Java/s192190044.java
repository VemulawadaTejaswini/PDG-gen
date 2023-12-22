import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numbers = sc.nextInt();
		int[] values = new int[numbers];
		int sum = 0;
		for (int i = 0; i < numbers; i++) {
			values[i] = sc.nextInt();
			sum += values[i];
		}
		
		// finding the average
		int averageCeil = (int) Math.ceil(sum * 1.0/numbers);
		int averageFloor = (int) Math.floor(sum * 1.0/numbers);
		
		// computing the cost
		int totalcost = 0; 
		for (int i = 0; i < numbers; i++) {
			int x = Math.min(((values[i] - averageCeil) * (values[i] - averageCeil)),(values[i] - averageFloor) * (values[i] - averageFloor));
			totalcost += x;
		}
		System.out.println(totalcost);
	}
}