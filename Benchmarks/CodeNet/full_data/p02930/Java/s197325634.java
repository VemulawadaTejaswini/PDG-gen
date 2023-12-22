import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c;
		for(int i = n-1; i > 0; i--){
			c = 1;
			for(int j = 0; j < i; j++){
				if(c == 1){
				System.out.print(c + " ");
				c = 2;
				}
				else{
					System.out.print(c + " ");
					c = 1;
				}
			}
			System.out.println();
		}

	}

}