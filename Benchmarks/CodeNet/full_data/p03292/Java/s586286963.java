import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
    	int A1 = scanner.nextInt();
    	int A2 = scanner.nextInt();
    	int A3 = scanner.nextInt();
		int[] list = {A1, A2, A3};
		int cost = 0;
		
		//System.out.println(A1);
		//System.out.println(A2);
		//System.out.println(A3);
		
		int cost1 = list[0]*0 + Math.abs(list[1]-list[0]) + Math.abs(list[2]-list[1]);
		int cost2 = list[1]*0 + Math.abs(list[2]-list[1]) + Math.abs(list[0]-list[2]);
		int cost3 = list[2]*0 + Math.abs(list[0]-list[2]) + Math.abs(list[1]-list[0]);
		
		int[] min = {cost1, cost2, cost3};
		Arrays.sort(min);
		for (int i : min) {
			//System.out.println(i);
			cost = min[0];
		}
		
		/*
		for (int i : list) {
			//System.out.println("min = " + min);
			System.out.println(i);
		}
		*/
		System.out.println(cost);
	}
}