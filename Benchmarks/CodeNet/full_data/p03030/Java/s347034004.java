import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		String str[]=new String[a];
		int x[]=new int[a];
		for(int i=0;i<a;i++) {
			str[i]=scan.next();
			x[i]=scan.nextInt();
		}
		int b[][]=new int[a][2];
		for(int i=0;i<a;i++) {
			String stri=str[i];
			int z=x[i];
			int an=1;
			for(int j=0;j<a;j++) {
				String s=str[j];
				if(stri.compareTo(s)>0) {
					an++;
				}
				if(stri.equals(s)) {
					if(z<x[j]) {
						an++;
					}
				}
			}
			b[i][0]=an;
			b[i][1]=i;
		}
		Arrays.sort(b,(q, y)->Integer.compare(q[0],y[0]));
		for(int i=0;i<a;i++) {
			System.out.println(b[i][1]+1);
		}
	}
}
