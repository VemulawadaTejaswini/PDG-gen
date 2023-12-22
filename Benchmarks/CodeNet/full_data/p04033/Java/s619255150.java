import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int head = sc.nextInt();
		int tail = sc.nextInt();
		int num = head;
		
		for (int i = head +1 ; i <= tail; i++){
			num *= i;
		}
		
		if(num < 0){
		 	System.out.println("Negative");
		 } else if(num > 0){
		 	System.out.println("Positive");
		 } else {
		 	System.out.println("Zero");
		 }
		
		
	}
}
