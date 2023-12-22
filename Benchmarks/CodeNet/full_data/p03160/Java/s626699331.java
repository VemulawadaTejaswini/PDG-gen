import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] stepInfo = new int[n];
		for(int i =0;i < n; i++) {
			stepInfo[i] = sc.nextInt();
		}
		int[] minimumCostInfo = new int[n];
		minimumCostInfo[1] = Math.abs(stepInfo[1]-stepInfo[0]);

		for(int i =2; i < n;i++) {
			int costBeforeOne = minimumCostInfo[i-1] + Math.abs(stepInfo[i]-stepInfo[i-1]);
			int costBeforeTwo = minimumCostInfo[i-2] + Math.abs(stepInfo[i]-stepInfo[i-2]);
			if(costBeforeOne> costBeforeTwo) {
				minimumCostInfo[i] = costBeforeTwo;
			}else {
				minimumCostInfo[i] = costBeforeOne;
			}

		}

		System.out.println(minimumCostInfo[n-1]);

	}
}