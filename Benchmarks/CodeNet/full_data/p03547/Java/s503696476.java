import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String X = sc.nextLine();
		String Y = sc.nextLine();
		String answer;

		if(0>X.compareTo(Y)){
			answer = "<";
		}
		else if (0<X.compareTo(Y)){
			answer = ">";
		}
		else {
			answer = "=";
		}

		System.out.println(answer);
	}
}