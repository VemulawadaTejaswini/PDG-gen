import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	long inputA = sc.nextLong();
	long inputB = sc.nextLong();
	long inputK = sc.nextLong();

	if(inputA >= inputK){
		inputA = inputA - inputK;
		inputK = 0;
	}else{
		inputK = inputK - inputA;
		inputA = 0;
	}

	if(inputK > 0){
		if(inputB >= inputK){
			inputB = inputB - inputK;
			inputK = 0;
		}else{
			inputK = 0;
			inputB = 0;
		}
	}

	System.out.println(inputA + " " + inputB);
}
}
