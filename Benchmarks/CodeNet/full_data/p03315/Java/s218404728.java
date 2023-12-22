import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int n = 0;
		
		for(int i = 0; i < 4; i++) {
			char op = s.charAt(i);
			
			switch(op){
			case '+' :
				n++;
				break;
			case '-' :
				n--;
				break;
			}
		}
		
		System.out.println(n);
		
	}
}