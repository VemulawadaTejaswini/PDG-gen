import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();

		scanner.close();
		
		String[] inputs = input.split(" ", 0);
		
		String inAStr = inputs[0];
		String inBStr = inputs[1];
		
		Integer inA = Integer.parseInt(inAStr);
		Integer inB = Integer.parseInt(inBStr);
		
		Integer valAA = inA + inA - 1;
		Integer valAB = inA + inB;
		Integer valBB = inB + inB - 1;
		
		Integer max = valAA < valAB ? valAB : valAA;
		Integer max2 = max < valBB ? valBB : max;
		
		System.out.println(max2);
	}
}
