import java.util.Scanner;

class Main {

	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		char S[]=new char[3000000];
		char T[]=new char[3000000];
		int a[]=new int[3000000];
		int b[]=new int[3000000];
		char c[]=new char[3000000];
		char d[]=new char[3000000];
		String s;
		String t;
		int z=0,y=0,x=0,fin=0;
		s=stdIn.next();
		t=stdIn.next();
		int s1=s.length();
		while(z<s1) {
			S[z]=s.charAt(z);
			T[z]=t.charAt(z);
			if(S[z]!=T[z]) {
				a[y]=z;
				c[y]=S[z];
				d[y]=T[z];
				while(x<=y) {
					if(d[x]==d[y])
						if(c[x]!=c[y]) {
							System.out.println("No");
							fin=1;
							break;
						}
					x++;
				}x=0;
				y++;
			}
			if(fin==1)
				break;
			z++;
		}
		if(fin==0)
			System.out.println("Yes");
	}
}