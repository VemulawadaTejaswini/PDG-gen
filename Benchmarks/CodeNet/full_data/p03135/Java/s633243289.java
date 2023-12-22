import java.util.*;
public class Main {
	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();
		float a =Float.parseFloat(str1);
		float b =Float.parseFloat(str2);
		float c ;
		c = a/b;
		
		System.out.println(c);
    }
}