import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		String Sdash = sc.nextLine();
		String T = sc.nextLine();

		for(int i=0;i<=Sdash.length() - T.length();i++) {
			String temp = Sdash;
			int k = i;
			boolean flag = true;
			for(int j=0;j<T.length();j++) {
				if(Sdash.charAt(k) != '?' && T.charAt(j) != Sdash.charAt(k)) {
					flag = false;
					break;
				}else{
					temp = temp.substring(0,k) + T.substring(j, j+1) + temp.substring(k+1, Sdash.length());
					k++;
				}
			}

			if(flag) {
				for(int j=0;j<Sdash.length();j++) {
					if(temp.charAt(j) == '?') {
						temp = temp.substring(0,j) + "a" + temp.substring(j+1,Sdash.length());
					}
				}
				System.out.println(temp);
				return;
			}
		}
		System.out.println("UNRESTORABLE");
		return;
	}
}
