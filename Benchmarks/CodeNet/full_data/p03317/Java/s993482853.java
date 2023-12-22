import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int K=stdIn.nextInt();
		int z=0,y=0,ans=0;
		while(z<N){
			y=stdIn.nextInt();
			if(y==1){
				y=z;
				break;
			}
			z++;
		}z=0;
		ans+=(y-1)/(K-1);
		ans+=(N-y)/(K-1);
		if(((y-1)%(K-1))+((N-y)%(K-1))>K-1){
			ans+=2;
		}
		else
			ans+=1;
		if(((y-1)%(K-1))+((N-y)%(K-1))==0)
			ans-=1;
		System.out.println(ans);
	}
}