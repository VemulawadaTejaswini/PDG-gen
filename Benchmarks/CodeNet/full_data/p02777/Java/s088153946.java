import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b1,b2;
		String str = sc.nextLine();
		String[] a = str.split(" ");
		String str1 = sc.nextLine();
		String[] a1 = str1.split(" ");
		String str2 = sc.nextLine();
		if(str2==a1[0]) {
			b1 = Integer.parseInt(a1[0])-1;
			b2 = Integer.parseInt(a1[1]);
		}
		else if(str2==a1[1]) {
			b1 = Integer.parseInt(a1[0]);
			b2 = Integer.parseInt(a1[1])-1;
		}
		System.out.println(b1+" "+b2);
		
	}