import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		String str;
		String[] spl = new String[100];
		String[] cp = new String[100];
		String ch = "";
		int [] count = new int[100];
		int i = 0;
		int Cc = 0;
		Scanner scan= new Scanner(System.in);

		str = scan.next();
		spl = str.split("");

		for(String s : spl) {
			cp[i] = s;
			i++;
		}
		for(int j = 0; j < str.length(); j++) {
			String U = str.substring(j + 1,str.length());
			if(!U.contains(cp[j])) {
				ch = cp[j];
				for(int k = 0;k < str.length(); k++) {
					if(ch.equals(cp[k])) {
						count[j]++;
					}
				}
			}
		}
		for(int l= 0; l < str.length(); l++) {
			if(count[l] % 2 != 0) {
				Cc++;
			}
		}
		if(Cc > 0) {
			System.out.println("No");
		}
		else {
			System.out.println("Yes");
		}
	}
}