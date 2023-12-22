import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int idx=0, idx2=0;
		boolean a=false;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='A' && !a) {
				a=true;
				idx=i;
			}
			if(s.charAt(i)=='Z' && a) {
				idx2=i;
			}
		}
		System.out.println(idx2-idx+1);
		
	}

}
