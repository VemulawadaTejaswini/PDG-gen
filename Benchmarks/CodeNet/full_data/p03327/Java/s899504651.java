import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N <= 999){
			System.out.println("ABC");
			return;
		}else{
			System.out.println("ABD");
		}
	}
}