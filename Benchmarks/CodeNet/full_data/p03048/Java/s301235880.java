import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int R=stdIn.nextInt();
		int G=stdIn.nextInt();
		int B=stdIn.nextInt();
		int N=stdIn.nextInt();
		int z=0,y=0,x=0,ans=0,max=0;
		while(max<=N){
			while(max<=N){
				while(max<=N){
					max=(z*R)+(y*G)+(x*B);
					if(max==N)
						ans++;
					x++;
				}
				y++;x=0;max=(z*R)+(y*G)+(x*B);
			}
			z++;y=0;x=0;max=(z*R)+(y*G)+(x*B);
		}
		System.out.println(ans);
	}
}