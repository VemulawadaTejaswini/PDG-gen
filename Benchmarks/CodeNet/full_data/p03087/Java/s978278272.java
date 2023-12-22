import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		String str=scan.next();
		int C[]=new int[str.length()*2-1];
		int s=1;
		for(int i=0;i<str.length()-1;i++) {
			char o=str.charAt(i);
			char t=str.charAt(i+1);
			int Z=s*2;
			if(o=='A'&&t=='C') {
				C[Z]++;
			}
			s++;
		}
		for(int i=0;i<b;i++) {
			int c=scan.nextInt();
			int d=scan.nextInt();
			int count=0;
			for(int j=2*c-1;j<2*d-1;j++) {
				count+=C[j];
			}
			System.out.println(count);
		}
		
	}
	}