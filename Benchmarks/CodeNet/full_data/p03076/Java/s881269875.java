import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		
		Stack <Integer> S = new Stack <> ();
		
		S.push(a);
		int min = a%10;
		
		if (b%10<min && b%10!=0){
			S.add(0, b);
			min = b%10;
		}
		
		else {
			S.add(1, b);
		}
			
		if (c%10<min && c%10!=0){
			S.add(0, c);
			min = c%10;
		}
		
		else {
			S.add(1, c);
		}
		
		if (d%10<min && d%10!=0){
			S.add(0, d);
			min = d%10;
		}
		
		else {
			S.add(1, d);
		}
		
		if (e%10<min && e%10!=0){
			S.add(0, e);
		}
		
		else {
			S.add(1, e);
		}
		
		int temp = S.get(0);
		S.remove(0);
		
		while (S.isEmpty()!=true){
			int pop = S.pop();
			int rem = pop%10;
			
			if (rem!=0){
				temp+=(pop-rem+10);
				
			}
			else temp+=pop;
			
		}
		System.out.println(temp);

	}

}
