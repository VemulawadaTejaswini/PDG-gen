import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(n == 1){
			System.out.println("1");
			System.out.println("1 0 3");
		}else if(n == 2){
			System.out.println("2");
			System.out.println("2 2");
		}else if(n == 0){
			System.out.println("4");
			System.out.println("3 3 3");
		}else{
			System.out.println(n);
			for(int i = 0;i < n-1;i++){
				System.out.print(n);
				System.out.print(" ");
			}
			System.out.println(n);
		}

	}

}