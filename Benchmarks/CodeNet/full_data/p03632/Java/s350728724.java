import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int A = input.nextInt();
			int B = input.nextInt();
			int C = input. nextInt();
			int D = input.nextInt();
			
			if(A > D || C > B){
				System.out.println("0");
			} else {
				System.out.println(Math.min(B, D) - Math.max(A, C));
			}
			
		}

	}

}
