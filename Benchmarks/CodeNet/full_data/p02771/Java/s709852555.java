import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String str = s.next();
		String strs[] = new String[3];
		strs = str.split(" ");
		if(strs[0].equals(strs[1])) {
			if(!strs[0].equals(strs[2])) {
				System.out.println("Yes");				
			}else {
				System.out.println("No");				
			}
		}
		
		if(strs[1].equals(strs[2])) {
			if(!strs[1].equals(strs[0])) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}

		if(strs[0].equals(strs[2])) {
			if(!strs[0].equals(strs[1])) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}

}