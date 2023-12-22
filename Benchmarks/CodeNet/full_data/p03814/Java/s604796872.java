import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		int acount=0;
		int zcount =300000;

		for(int i=0;i<str.length();i++) {
			if(String.valueOf(str.charAt(i)).equals("A")){
				acount =i;
				break;
			}
		}

		for(int i=str.length()-1; i>=0;i--) {
			if(String.valueOf(str.charAt(i)).equals("Z")){
				zcount =i;
				break;
			}
		}

		System.out.print(zcount-acount+1);
	}

}