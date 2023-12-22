import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		String S=stdIn.next();
		char s[]=S.toCharArray();
		int r=0,g=0,b=0;
		long ans=0;
		for(int i=0;i<N;i++){
			if(s[i]=='R')
				r++;
			if(s[i]=='G')
				g++;
			if(s[i]=='B')
				b++;
		}
		ans=r*g*b;
		for(int i=0;i<N-2;i++){
			for(int l=0;i+2+(l*2)<N;l++){
				if(s[i]!=s[i+1+l]&&s[i]!=s[i+2+(l*2)]&&s[i+2+(l*2)]!=s[i+1+l])
					ans--;
			}
		}
		System.out.println(ans);
	}
}
