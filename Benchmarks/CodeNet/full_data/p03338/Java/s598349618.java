import java.util.Scanner;
public class Main {
	public static int buf(char a){
		int b=0;
		if(a=='a')
			b=1;
		if(a=='b')
			b=2;
		if(a=='c')
			b=3;
		if(a=='d')
			b=4;
		if(a=='e')
			b=5;
		if(a=='f')
			b=6;
		if(a=='g')
			b=7;
		if(a=='h')
			b=8;
		if(a=='i')
			b=9;
		if(a=='j')
			b=10;
		if(a=='k')
			b=11;
		if(a=='l')
			b=12;
		if(a=='m')
			b=13;
		if(a=='n')
			b=14;
		if(a=='o')
			b=15;
		if(a=='p')
			b=16;
		if(a=='q')
			b=17;
		if(a=='r')
			b=18;
		if(a=='s')
			b=19;
		if(a=='t')
			b=20;
		if(a=='u')
			b=21;
		if(a=='v')
			b=22;
		if(a=='w')
			b=23;
		if(a=='x')
			b=24;
		if(a=='y')
			b=25;
		if(a=='z')
			b=26;
		return b;
	}
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		String S=stdIn.next();
		char a[]=new char[N];
		int b[]=new int[27];
		int z=0,y=1,x=0,X=0,Y=N-1,cun=0,max=0;
		while(z<N){
			a[z]=S.charAt(z);
			
			z++;
		}z=0;
		while(X<N-1){
			while(z<=X){
				if(b[buf(a[z])]==0){
					while(y<=Y){
						if(a[z]==a[y]){
							cun++;
							break;
						}
						y++;
					}y=X+1;
					b[buf(a[z])]++;
				}
				z++;
			}z=1;
			while(z<27){
				b[z]=0;
				z++;
			}z=0;
			if(max<cun)
				max=cun;
			cun=0;
			X++;
		}
		System.out.println(max);
	}
}
