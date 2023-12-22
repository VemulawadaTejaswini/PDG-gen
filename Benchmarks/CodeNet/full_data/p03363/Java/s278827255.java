import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int A[]=new int[N];
		int b[]=new int[N];
		int st[]=new int[N];
		int fin[]=new int[N];
		int z=0,y=0,x=0,w=0,v=1,s=0,cun=1,max=0;
		while(z<N){
			A[z]=stdIn.nextInt();
			while(y<=z){
				b[y]+=A[z];
				if(b[y]==0){
					st[w]=y;
					fin[w]=z;
					w++;
					x=y+1;
				}
				y++;
			}y=x;
			z++;
		}z=0;y=0;x=0;
		while(x<w){
			while(y<w){
				if(fin[z]+1==st[y]){
					if(z==x)
						s+=2;
					else
						s++;
					fin[z]=-1;z=y;y++;cun++;
				}
				else{
					y++;
				}
			}z=1;
			while(z<=cun){
				v*=z;
				z++;
			}
			max+=v;
			if(w-s==0)
				break;
			cun=1;
			v=1;
			x++;
			z=x;
			y=z+1;
		}z=0;
		System.out.println(max);
	}
}