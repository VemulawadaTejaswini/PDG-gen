import java.util.Scanner;

public class At_1 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();

		if(Math.abs(x-a) < Math.abs(x-b)){
			System.out.println("A");
		}else{
			System.out.println("B");
		}

		scan.close();
	}
}
