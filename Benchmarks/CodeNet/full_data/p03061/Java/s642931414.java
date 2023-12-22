import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int A[]=new int[N];
		int b[]=new int[N];
		int c[]=new int[N];
		int z=0,y=0,x=0,ans=0,ans2=0;
		while(z<N){
			A[z]=stdIn.nextInt();
			z++;
		}z=0;
		Arrays.sort(A);
		ans=A[z+1];
		while(z<=N-1){
			y=A[z];
			while(true){
				if(y%ans==0){
					break;
				}
				x=y%ans;
				y=ans;ans=x;
			}
			if(z==0)
				ans=A[z];
			b[z]=ans;
			z++;
		}z=N-1;y=0;ans=A[z-1];
		while(z>=0){
			y=A[z];
			if(ans>y){
				x=ans;ans=y;y=x;
			}
			while(true){
				if(y%ans==0){
					break;
				}
				x=y%ans;
				y=ans;ans=x;
			}
			if(z==N-1)
				ans=A[z];
			c[z]=ans;
			z--;
		}z=0;y=0;
		while(z<N){
			if(z!=0&&z!=N-1){
				if(b[z-1]>=c[z+1]){
					y=b[z-1];ans=c[z+1];
				}
				else{
					y=c[z+1];ans=b[z-1];
				}
				while(true){
					if(y%ans==0){
						break;
					}
					x=y%ans;
					y=ans;ans=x;
				}
			}
			if(z==0)
				ans=c[1];
			if(z==N-1)
				ans=b[N-2];
			if(ans>ans2)
				ans2=ans;
			z++;
		}
		System.out.println(ans2);
	}
}