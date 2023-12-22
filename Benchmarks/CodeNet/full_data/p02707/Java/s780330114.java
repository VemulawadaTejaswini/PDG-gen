
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		Scanner sca = new Scanner(System.in);
		String A = sca.nextLine();
		String[] a = A.split(" ");
		ArrayList<Integer> number = new ArrayList<>();
		for(int i = 0; i<a.length+1; i++) {
			number.add(0);
		}
		for(int i = 0; i<a.length; i++) {
			number.set(Integer.parseInt(a[i])-1,number.get(Integer.parseInt(a[i])-1)+1);
		}

		for(int ans : number) {
			System.out.println(ans);
		}
	}
}
