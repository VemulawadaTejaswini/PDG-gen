import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 String S = sc.next();
		 int count = 0;
		 int temp = 0;
		 for(int i=0; i<S.length(); i++) {
			 if(S.charAt(i)=='A'||S.charAt(i)=='T'||S.charAt(i)=='C'||S.charAt(i)=='G') {
				 count++;
			 }else {
				 count = 0;
			 }
			 if(temp < count) {
				 temp = count;
			 }
		 }
		 System.out.print(temp);
	}
}