import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		String A=stdIn.next();
		String B=stdIn.next();
		String C=stdIn.next();
		char[]a=new char[N];
		char[]b=new char[N];
		char[]c=new char[N];
		int z=0,y=0;
		while(z<N){
			a[z]=A.charAt(z);
			b[z]=B.charAt(z);
			c[z]=C.charAt(z);
			if(a[z]==b[z]||a[z]==c[z])
				y++;
			else
				if(b[z]==c[z])
					y++;
				else
					y+=2;
			if(a[z]==b[z]&&a[z]==c[z])
				if(b[z]==c[z])
					y--;
			z++;
		}
		System.out.println(y);
	}

}