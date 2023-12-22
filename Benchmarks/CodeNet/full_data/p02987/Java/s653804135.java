import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		String S=t.nextLine();
		if(S.length()> 4) {
			System.out.println("No");
		}else {
		if(S.substring(0, 1).equals(S.substring(1,2)) || S.substring(0, 1).equals(S.substring(2,3)) || S.substring(0, 1).equals(S.substring(3,4))){
		if(S.substring(0, 1).equals(S.substring(1,2))) {
			if(S.substring(2,3).equals(S.substring(3,4))) {
				System.out.println("Yes");
			}
		}else {
			if(S.substring(1, 2).equals(S.substring(2,3)) || S.substring(1, 2).equals(S.substring(3,4))){
				System.out.println("Yes");
			}
		}
		}else {
			System.out.println("No");
		}
	
	}
	}
	}
