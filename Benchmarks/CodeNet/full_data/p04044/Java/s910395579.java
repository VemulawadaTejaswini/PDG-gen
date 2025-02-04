import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String firstLine = sc.nextLine();
		int numOfInputs = Integer.valueOf(firstLine.split(" ")[0]);
		String[] inputArray = new String[numOfInputs];
		for(int i=0;i<numOfInputs;i++){
			inputArray[i] = sc.next();
		}
		Arrays.sort(inputArray);

		StringBuilder sb = new StringBuilder();
		for(String input : inputArray){
			sb.append(input);
		}
		
		System.out.print(sb.toString());
		return;
	}
}