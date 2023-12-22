import java.util.*;

public class Main {
  
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		
		String[] inputArray = line.split(" ");
		
		double timeAtB = Double.valueOf(inputArray[0]);
		double rateAtB = Double.valueOf(inputArray[1]);
		
		System.out.println(Double.toString(timeAtB / rateAtB));
    
    }
}