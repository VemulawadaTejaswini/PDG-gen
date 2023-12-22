import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s = String.valueOf(N);
		String[] sa = s.split("");
		String result;

		if(sa[1]==sa[2] ^ sa[2]==sa[3]){
			result = "Yes";
		}
		else if(sa[2]==sa[3] ^ sa[3]==sa[4]){
			result = "Yes";
		}
		else{
			result = "No";
		}

		System.out.println(result);
	}
}