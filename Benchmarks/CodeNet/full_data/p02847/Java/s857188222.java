import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String arr[] = 
			{"SUN","MON","TUE","WED","THU","FRI","SAT" };
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int a = 0;
		for(int i = 0 ; i < arr.length ; ++i) {
			if(arr[i].equals(S)) {
				a = i;
			}
		}
		a = 7 - a;
		System.out.println(a);
		
	}
}
