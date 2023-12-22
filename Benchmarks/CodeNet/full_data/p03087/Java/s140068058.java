import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		String str=scan.next();
		int C[]=new int[a];
		int s=0;
		for(int i=1;i<a;i++) {
			char o=str.charAt(i-1);
			char t=str.charAt(i);
			if(o=='A'&&t=='C') {
				s++;
			}
			C[i]=s;
		}
		for(int i=0;i<b;i++) {
			int c=scan.nextInt();
			int d=scan.nextInt();
			System.out.println(C[d-1]-C[c-1]);
		}
	}
}