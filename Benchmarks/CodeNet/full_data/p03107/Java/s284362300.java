import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder(sc.nextLine());
		int firstLength = sb.length();

		for(int i = 0;i < firstLength;i++) {
			if(sb.indexOf("01") != -1){
				while(sb.indexOf("01") != -1) {
					int i1 = sb.indexOf("01");
					int i11 = i1 + 2;
					sb.delete(i1,i11);
				}
			}else if(sb.indexOf("10") != -1){
				while(sb.indexOf("10") != -1) {
					int i2 = sb.indexOf("10");
					int i22 = i2 + 2;
					sb.delete(i2,i22);
				}
			}else{
				break;
			}
		}
		int lastLength = sb.length();

		System.out.println(firstLength - lastLength);

	}
}