import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int count =0;
		while(Math.pow(k, count)<=n) {
			count++;
		}
		System.out.println(count);
		kb.close();
		
	}

}
