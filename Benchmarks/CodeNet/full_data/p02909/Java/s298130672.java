import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		String S=stdIn.next();
		if(S.equals("Sunny"))
			System.out.println("Cloudy");
		if(S.equals("Cloudy"))
			System.out.println("Rainy");
		if(S.equals("Rainy"))
			System.out.println("Sunny");
	}
}