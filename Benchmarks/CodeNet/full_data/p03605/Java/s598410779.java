import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
	Scanner in = new Scanner(System.in);

	String N = in.next();

	if(N.indexOf("9") == -1){
		System.out.println("No");
	}
	else{
		System.out.println("Yes");
	}
}
}