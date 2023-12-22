import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		String S=stdIn.next();
		int N=S.length();
		int roop[]=new int[S.length()];
		char A[]=new char[N];
		int ans[]=new int[N];
		int z=0,y=0,x=0;
		while(z<N){
			A[z]=S.charAt(z);
			if(z!=0)
				if(A[z]=='L'&&A[z-1]=='R'){
					roop[y]=z-1;
					roop[y+1]=z;
					y+=2;
				}
			z++;
		}z=0;
		while(z<N){
			if(z==roop[x+1]){
				ans[roop[x+1]]++;
				x+=2;
			}
			else{
				if(z<roop[x]&&A[z]=='R')
					if((roop[x]-z)%2==1)
						ans[roop[x+1]]++;
					else
						ans[roop[x]]++;
				if(x!=0&&z>roop[x-1]&&A[z]=='L')
					if((z-roop[x-1])%2==1)
						ans[roop[x-2]]++;
					else
						ans[roop[x-1]]++;
				if(z==roop[x])
					ans[roop[x]]++;
			}
			z++;
		}z=0;
		while(z<N){
			System.out.println(ans[z]);
			z++;
		}
	}
}