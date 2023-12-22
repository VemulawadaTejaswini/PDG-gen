import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long head = sc.nextInt();
		long tail = sc.nextInt();
		long num = head;
		
		for (long i = head + 1 ; i <= tail; i++){
			num *= i;
		}
		
		if(num < 0){
		 	System.out.prlongln("Negative");
		 } else if(num > 0){
		 	System.out.prlongln("Positive");
		 } else {
		 	System.out.prlongln("Zero");
		 }
		
		
	}
}
