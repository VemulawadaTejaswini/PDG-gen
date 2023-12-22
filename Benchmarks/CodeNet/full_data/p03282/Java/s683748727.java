import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		String str=in.next();
		int k=in.nextInt()-1;
		if(k<str.length()) {
			int i=0;
			for(;i<str.length();i++) {
				if(str.charAt(i)>'1') {
					System.out.println(str.charAt(i));
					i=str.length();
					break;
				}
			}
			
			if(i==k)System.out.println(1);
		}
		else {
			int i=0;
			for(;i<str.length();i++) {
				if(str.charAt(i)>'1') {
					System.out.println(str.charAt(i));
					break;
				}
			}
			
			if(i==str.length())System.out.println(1);
		}
	}

}
