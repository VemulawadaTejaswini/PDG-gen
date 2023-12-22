import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		String b = sc.next();
		String c = sc.next();

               if(a != b && b != c && c == a) System.out.print("Yes");
               else System.out.print("No");
	}
}