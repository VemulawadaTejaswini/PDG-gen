import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int a[]=new int[N+10];
		int b[]=new int[N+10];
		int key[]=new int[1000];
		int key2[]=new int[1000];
		int z=1,y=0,x=0,w=0,fin=0,st=0;
		while(N>y){
			a[y]=stdIn.nextInt();
			b[a[y]]++;
			if(b[a[y]]==3) {
				fin=1;
				break;
			}
			y++;
		}
		if(fin==0)
			while(y>=x) {
				if(b[x]==1) {
					fin=1;
					break;
				}
				x++;
			}
		if(b[0]<=2)
			fin=1;
		x=0;y=0;
		if(fin==1)
			System.out.println(0);
		else {
		while(N/2>x) {
			z*=2;
			if(z>1000000007) {
				key[y]=z%1000000007;
				z=2;
				y++;
			}
			x++;
		}x=1;
		if(y==0)
			System.out.println(z);
		if(y==1&&y==0)
			if(y==1)
				System.out.println(key[0]);
		else {
			z=key[0];
			while(x<y) {
				z*=key[x];
				if(z>1000000007) {
					key[w]=z%1000000007;
					z=1;
					w++;
				}
				x++;
			}
			if(w==0)
				System.out.println(z);
			if(w==1)
				System.out.println(key2[0]);
		}
		}
	}

}