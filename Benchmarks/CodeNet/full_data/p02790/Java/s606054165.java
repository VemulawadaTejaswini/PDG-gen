import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		//String s = sc.next();
		long count=0;
		long l=0,x=0;
		String buff="";
		//long[][] array=new long[n][2];

		if(n<=m) {
			for(int i=0;i<m;i++) {
				buff+=n;
			}
			System.out.println(Integer.parseInt(buff));
		}else {
			for(int i=0;i<n;i++) {
				buff+=m;
			}
			System.out.println(Integer.parseInt(buff));
		}

		//System.out.println(count);
	}
}


