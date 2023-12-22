import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws Exception{
		Scanner stdIn=new Scanner(System.in);
		String S=stdIn.next();
		char A[]=new char[100];
		char b[]={'k','e','y','e','n','c','e'};
		int z=0,y=0,n=0,m=0,Slen=S.length();
		while(z<Slen){
			A[z]=S.charAt(z);
			if(A[z]==b[y]){
				y++;
				if(n!=y)
					m++;
				n=y+1;
			}
			if(m==2){
				Slen=0;
				break;
			}
			z++;
		}
		if(Slen==0)
			System.out.println("NO");
		else
			if(y==7)
			System.out.println("YES");
			else
				System.out.println("NO");
	}
}