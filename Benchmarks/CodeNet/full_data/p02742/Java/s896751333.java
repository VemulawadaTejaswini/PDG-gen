import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		Long H = scan.nextLong();
		Long W = scan.nextLong();
		Long result = H*W/2;
		if(H==W) {

		}else if(H*W%2==1) {
			result++;
		}
		System.out.println(result);
	}
}