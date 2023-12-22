import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int R=stdIn.nextInt();
		int G=stdIn.nextInt();
		int B=stdIn.nextInt();
		int N=stdIn.nextInt();
		int z=0,y=0,x=0,ans=0,max=B+1;
		while(true){
			while(true){
				max=(z*R)+(y*G);
				if(max>N)
					break;
				max=N-max;
				if(max%B==0)
					ans++;
				y++;
			}
			z++;y=0;
			if(z*R>N)
				break;
		}
		System.out.println(ans);
	}
}