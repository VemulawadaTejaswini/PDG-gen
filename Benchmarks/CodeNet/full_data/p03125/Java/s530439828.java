import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String line = null;
		try(Scanner sc=  new Scanner(System.in)){
			line = sc.nextLine();
		}catch (Exception e) {
			e.printStackTrace();
		}
		String[] tmpArray = line.split(" ");
		int numA = Integer.parseInt(tmpArray[0]);
		int numB = Integer.parseInt(tmpArray[1]);
		int result = 0;
		if(numB % numA == 0){
			result = numA + numB;
		}else{
			result = numB - numA;
		}
		
		System.out.println(result);
	}
}