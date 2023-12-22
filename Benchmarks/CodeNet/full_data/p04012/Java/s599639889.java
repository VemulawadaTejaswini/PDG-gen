import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		String str = "";
		String[] spl = new String[100];
		String[] cp = new String[100];
		String ch = "";
		int count = 0;
		Scanner scan= new Scanner(System.in);
		
		str = scan.next();
		spl = str.split("");
		
		for(String s : spl) {
			int i = 0;
			cp[i] = s;
			i++;
		}
		for(int j = 0; j < spl.length; j++) {
			ch = cp[j];
			for(int k = 0;k < cp.length; k++) {
				if(ch == cp[k]) {
					count++;
				}
			}
		}
		if(count % 2 == 0) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}