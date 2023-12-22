import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scn =  new Scanner(System.in);
		String str = scn.nextLine();
		String key = "keyence";
		String buf,buf2;
		boolean ans = false;
		for(int i = 0;i <= 7;i++) {
			buf = str.substring(0, i);
			if(buf.equals(key.substring(0, i))) {
			}else {
				key = key.substring(i);
				break;
			}
			if(i == 7)
			ans = true;
		}
		ans |= key.equals(str.substring(str.length() - key.length()));
		System.out.println(ans?"YES":"NO");
	}
}
