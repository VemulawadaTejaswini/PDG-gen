import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int count =0;
		for (int i=A;i<=B;i++) {
			String temp = String.valueOf(i);
			boolean b = true;
			for (int j=0;j<2;j++) {
				if (temp.charAt(j)!=temp.charAt(temp.length()-j-1)) {
					b=false;
					break;
				}
			}
			if (b==true) {
				count ++;
			}
		}
		System.out.println(count);
	}
}