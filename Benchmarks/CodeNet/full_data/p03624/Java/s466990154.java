import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int[] array = new int[123];
		int count=0;
		for(int i=0;i<S.length();i++) {
			array[S.charAt(i)]++;
		}
		for(int i=97;i<123;i++) {
				System.out.println(array[i]);
		}
		for(int i=97;i<123;i++) {
			if(array[i]!=0) {
				count++;
			}
			if(count==26) {
				System.out.println("None");
				System.exit(0);
			}
		}
		for(int i=97;i<123;i++) {
			if(array[i]==0) {
				System.out.println(Character.toChars(i));
				break;
			}
		}
		//System.out.println(Character.toChars(97));

	}
	public static int sample() {
		return 1;
	}

}
