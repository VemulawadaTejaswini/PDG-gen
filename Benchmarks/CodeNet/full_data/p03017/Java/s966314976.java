import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		String S = sc.next();
		sc.close();

		String ans = "";
		if(C < D) {
			ans = "Yes";
			for(int i = A;i < D-1;i++){
				if(S.substring(i,i+2).equals("##")){
					ans = "No";
					break;
				}
			}
		}else {
			ans = "No";
			for(int i = B+1;i < D-1;i++) {
				if(S.substring(i-1,i+2).equals("...")) {
					ans = "Yes";
				}
			}
			
		}
		System.out.println(ans);
	}
}