import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		if(s.equals("AAA") || s.equals("BBB")) {
			pl("No");
		}
		else {
			pl("Yes");
		}
	}
	public static void pl(Object o) {
		System.out.println(o);
	}

}