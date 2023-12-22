import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N == 24){
		  System.out.println("Christmas Eve");
		} else if(N==25){
		  System.out.println("Christmas");
		} else if(N==23){
		  System.out.println("Christmas Eve Eve");
		} else if(N==22){
		  System.out.println("Christmas Eve Eve Eve");
		}
	}
}
