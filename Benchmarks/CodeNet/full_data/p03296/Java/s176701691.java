import java.util.Scanner;

public class Main {
	public static String str = "";
	public static int N = 0;
	public static int count = 0;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		str = scan.next();
		
		String a[] = str.split("");
	
		for(int i=1;i < a.length - 1;i++) {
			if(a[i] == a[i+1] || a[i] == a[i-1]) {
				count++;
			}
		}
		scan.close();
	}
}