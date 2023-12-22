import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s = String.valueOf(N);
		String[] sa = s.split("");

		if(sa[0]==sa[1]&&sa[1]==sa[2]){
			System.out.println("Yes");

		}
		else if(sa[1]==sa[2]&&sa[2]==sa[3]){
			System.out.println("Yes");

		}
		else{
			System.out.println("No");

		}
	}
}