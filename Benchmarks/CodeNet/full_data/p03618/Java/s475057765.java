import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		sc.close();
		
		int sum = 1;
		int len = A.length();
		for(int i=0; i<len; i++) {
			for(int j=i+1; j<len; j++) {
				if(A.charAt(i) != A.charAt(j)) sum++;
			}
		}
		System.out.println(sum);
	}

}