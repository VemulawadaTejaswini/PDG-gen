import java.util.*;
class Main{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder(s.next().replaceAll("dream", "D").replaceAll("er", "R").replaceAll("as", "A"));
		String[] m = {"RAR","RAe","DR","D"};
		boolean f;
		do {
			f=false;
			for(String b:m) {
				if(str.toString().endsWith(b)) {
					str.replace(str.length()-b.length(),str.length(),"");
					f=true;
					break;
				}
			}
		}while(f);
		System.out.println((str.toString().equals(""))?"YES":"NO");
	}
}