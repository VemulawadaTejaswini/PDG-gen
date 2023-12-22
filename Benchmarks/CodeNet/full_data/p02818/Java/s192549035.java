import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	long inputA = sc.nextLong();
	long inputB = sc.nextLong();
	long inputK = sc.nextLong();

	for(long i = 0; i < inputK; i++) {
		if(inputA >= 1) {
			inputA--;
			continue;
		}

		if(inputB >= 1){
			inputB--;
			continue;
		}
	}

	System.out.print( inputA);
	System.out.print( inputB);
}
}