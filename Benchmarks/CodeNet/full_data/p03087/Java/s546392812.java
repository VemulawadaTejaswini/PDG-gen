import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int Q=stdIn.nextInt();
		int ans[]=new int[N];
		int kota[]=new int[Q];
		String S=stdIn.next();
		int z=1,y=0,l=0,r=0,num=0;
		while(z<N){
			if(S.substring(z,z+1).equals("C")&&S.substring(z-1,z).equals("A")){
				y++;
			}
			ans[z]=y;
			z++;
		}z=0;y=0;
		while(z<Q){
			l=stdIn.nextInt();
			r=stdIn.nextInt();
			kota[z]=ans[r-1]-ans[l-1];
			z++;
		}z=0;
		while(z<Q){
			System.out.println(kota[z]);
			z++;
		}
	}
}