import java.util.Scanner;
public class Main {

	public static void main(String[] args)throws Exception {
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int T=stdIn.nextInt();
		int A=stdIn.nextInt();
		int H[]=new int[N];
		int z=0,y=0,x=0,key=0;
		while(z<N) {
			y=stdIn.nextInt();
			H[z]=(int) (T-y*0.006);
			z++;
		}z=0;y=0;
		y=H[z]-A;
		if(y<0)
			y*=-1;
		while(z<N) {
			x=H[z]-A;
			if(x<0)
				x*=-1;
			if(y>x) {
				y=x;key=z;
			}
			z++;
		}
		System.out.println(key+1);
	}
}