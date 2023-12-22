import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int sum = a + b;
		int mul = a * b;
		int min = a - b;
		if(sum > mul){
			if(sum > min){
				System.out.println(sum);
			}else{
				System.out.println(min);
			}
		}else{
			if(mul > min){
				System.out.println(mul);
			}else{
				System.out.println(min);
			}
		}
	}
}