import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1=scan.nextLine();
		String t="";
		for(int i=0;i<s1.length()-1;i++) {
			if(s1.charAt(i)==' ') {
				t+=s1.charAt(i+1);
			}
		}
		System.out.println(s1.toUpperCase().charAt(0)+""+t.toUpperCase());
	}

}
