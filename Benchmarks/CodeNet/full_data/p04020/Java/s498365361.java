import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		int result = 0;
		Scanner sc = new Scanner(System.in);
		int numOfInputs = sc.nextInt();
		int amariBefore = 0;
		
		for(int i=0;i<numOfInputs;i++){
			int tmpInput = sc.nextInt();
			if (amariBefore == 1
					&& tmpInput>0){
				result += 1;
				tmpInput--;
			}
			result += tmpInput / 2;
			amariBefore = tmpInput % 2;
		}
		System.out.print(result);
	}
}
