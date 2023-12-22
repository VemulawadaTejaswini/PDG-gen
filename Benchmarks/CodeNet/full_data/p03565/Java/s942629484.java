import java.util.Scanner;

public class Main{
	static Scanner s=new Scanner(System.in);
	static int gInt(){return Integer.parseInt(s.next());}

	public static void main(String[] $){
		String a=s.next().replaceAll("\\?","."),b=s.next();
		for(int i=a.length()-b.length();i>=0;--i) {
			String regex=a.substring(i,i+b.length());
			if(b.matches(regex)) {
				//System.out.println(regex);
				System.out.println(a.replaceFirst(regex,b).replaceAll("\\.","a"));
				return;
			}
		}
		System.out.println("UNRESTORABLE");
	}
}