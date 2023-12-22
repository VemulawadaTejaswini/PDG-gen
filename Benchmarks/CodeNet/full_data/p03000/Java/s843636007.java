import java.util.Scanner;

public class Main { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().split(" ");
		int startStep = Integer.parseInt(line[0]);
		int boundMax = Integer.parseInt(line[1]);
		String[] boundStep = sc.nextLine().split(" ");
		
		int resultCount = 1;
		int boundTotal = 0;
		for(int i = 0;i<boundStep.length;i++) {
			int tmp = Integer.parseInt(boundStep[i]);
			boundTotal += tmp;
			if(boundMax<boundTotal) {
				break;
			}
			resultCount++;
		}
		System.out.println(resultCount);
		
	}
}
	
	