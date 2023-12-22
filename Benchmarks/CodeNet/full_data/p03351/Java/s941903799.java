import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		int a = Integer.parseInt(scanner.next());
		int b = Integer.parseInt(scanner.next());
		int c = Integer.parseInt(scanner.next());
		int d = Integer.parseInt(scanner.next());
		
		if(Math.abs(a-c)<=d){
			System.out.println("Yes");
		}else if(Math.abs(a-b)>d){
			System.out.println("No");
		}else if(Math.abs(b-c)>d){
			System.out.println("No");
		}else{
			System.out.println("Yes");
		}
		
	}

}
