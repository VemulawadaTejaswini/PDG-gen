import java.util.Scanner;

class Main {

	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int key[]=new int[1000];
		int key2[]=new int[1000];
		int a[]=new int[N+10];
		int b[]=new int[N+10];
		int z=0,y=0,x=0,fin=0;
		int i=1;
		while(N>z) {
			a[z]=stdIn.nextInt();
			b[a[z]]++;
			if(b[a[z]]>2) {
				fin=1;
				break;
			}
			if(b[0]>1) {
				fin=1;
				break;
			}
			z++;
		}z=0;
		if(fin==1)
			System.out.println(0);
		else {
			while(N/2>z) {
				i*=2;
				if(i>1000000007) {
					key[y]=i%1000000007;
					y++;
				}
				z++;
			}z=0;
			if(y==1||y==0) {
				if(y==1)
					System.out.println(key[0]);
				if(y==0)
					System.out.println(i);
			}
			else {
				i=1;
				while(y>z) {
					i*=key[z];
					if(i>1000000007) {
						key2[x]=i%1000000007;
						x++;
					}
					z++;
				}
				if(x==1||x==0) {
					if(x==1)
						System.out.println(key2[0]);
					if(x==0)
						System.out.println(i);
				}
				else {
						z=0;i=1;y=0;
						while(x>z) {
							i*=key2[z];
							if(i>1000000007) {
								key[y]=i%1000000007;
								y++;
							}
							z++;
						}
						if(y==1||y==0) {
							if(y==1)
								System.out.println(key[0]);
							if(y==0)
								System.out.println(i);
						}
					}
			}
		}
	}
}