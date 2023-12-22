import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String A = sc.nextLine();
		String B = sc.nextLine();

		String[] a = A.split("");
		String[] b = B.split("");


		//System.out.println(Arrays.toString(a));
		if (a[0].equals(b[2]) && a[2].equals(b[0])){
			if(a[1].equals(b[1])){
				System.out.println("YES");
			}
		}
		else{
			System.out.println("NO");
		}
	}
}