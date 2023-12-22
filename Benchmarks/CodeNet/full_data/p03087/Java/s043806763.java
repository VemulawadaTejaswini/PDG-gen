import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int Q=stdIn.nextInt();
		int ans[]=new int[Q];
		String S=stdIn.next();
		int s[]=new int[N];
		int f[]=new int[N];
		int z=0,y=0,x=0,x2=0,l=0,r=0,k1=0,k2=0,num=0;
		while(z<N-1){
			if(S.substring(z,z+1).equals("A")&&S.substring(z+1,z+2).equals("C")){
				s[y]=z;
				f[y]=z+1;
				y++;
			}
			z++;
		}z=0;num=y;y=0;
		while(z<Q){
			l=stdIn.nextInt()-1;
			r=stdIn.nextInt()-1;
			while(y<num){
				if(k1==0)
					if(s[y]>=l){
						x=y;
						k1=1;
					}
				if(k1==1)
					if(f[y]<=r){
						if(x2<y)
							x2=y;
					}
				y++;
				if(k1==1&&r<f[y])
					break;
			}
			if(k1==1&&x2>=x){
				ans[z]=x2-x+1;
			}
			k1=0;y=0;z++;x2=0;
		}z=0;
		while(z<Q){
			System.out.println(ans[z]);
			z++;
		}
	}
}