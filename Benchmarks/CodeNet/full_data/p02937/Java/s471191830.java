import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		purity();
	}
	public static void purity() {
		Scanner scanner=new Scanner(System.in);
		String s=scanner.nextLine();
		String t=scanner.nextLine();
		for(int index=0;index<t.length();index++) {
			if(s.indexOf(t.charAt(index))==-1) {
				System.out.println(-1);
				return;
			}
		}
		int firstpos=s.indexOf(t.charAt(0));
		for(int index=1;index<t.length();index++) {
			int secpos=s.indexOf(t.charAt(index));
			if(firstpos<secpos) {
				firstpos=secpos;
				continue;
			}
			while(firstpos>=secpos) {
				secpos+=s.length();
			}
			firstpos=secpos;
		}
		System.out.println(firstpos+1);
		
	}
}