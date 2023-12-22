
import java.util.Scanner;
public class A {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String S=scan.next();
		if(S=="Sunny"){
			System.out.print("Cloudy");
		}
		else if(S=="Cloudy"){
			System.out.print("Rainy");
			
		}
		else if(S=="Rainy"){
			System.out.print("Sunny");
		}

	}

}
