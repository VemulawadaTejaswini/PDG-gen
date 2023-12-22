import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		String b=scan.next();
		int R=0;
		int B=0;
		for(int i=0;i<n;i++) {
			char ch=b.charAt(i);
			if(ch=='B') {
				B++;
			}
			else {
				R++;
			}
		}
		System.out.println(R>B?"Yes":"No");
	}
}