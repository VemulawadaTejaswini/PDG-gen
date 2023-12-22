import java.util.Scanner;
public class Main {

	public static void main(String[] args)throws Exception {
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int a[]=new int[N];
		int pla=0,key=0,cun=0;
		int z=0;
		while(z<N) {
			a[z]=stdIn.nextInt();
			key+=a[z];
			if(a[0]<0)
				pla=1;
			if(pla==0) {
				if(z%2==0) {
					if(key<0) {
						cun+=key*-1+1;
						key=1;
					}
					if(key==0) {
						cun+=1;
						key+=1;
					}
				}
				else {
					if(key>0) {
						cun+=key+1;
						key=-1;
					}
					if(key==0) {
						cun+=1;
						key-=1;
					}
				}
			}
			else {
				if(z%2==1) {
					if(key<0) {
						cun+=key*-1+1;
						key+=1;
					}
					if(key==0) {
						cun+=1;
						key+=1;
					}
				}
				else {
					if(key>0) {
						cun+=key+1;
						key=-1;
					}
					if(key==0) {
						cun+=1;
						key-=1;
					}
				}
			}
			z++;
		}
		System.out.println(cun);
	}
}