import java.util.*;

class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String C = sc.next();
		
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		int a = alphabet.indexOf(C);
		
		System.out.println(alphabet.substring(a+1,a+2));

	}

}