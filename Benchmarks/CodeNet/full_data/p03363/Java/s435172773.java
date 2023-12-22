import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int a[]=new int[N+1];
		a[0]=0;
		a[1]=scan.nextInt();
		for(int i=2;i<N+1;i++){
			int c=scan.nextInt();
			a[i]=a[i-1]+c;
		}
		Arrays.sort(a);
		int ans=0;
		int co=0;
		for(int i=1;i<N+1;i++){
			if(a[i]!=a[i-1]){
				if(co!=0){
					ans+=(co+1)*co/2;
					co=0;
				}
			}
			else{
				co++;
			}
		}
		ans+=(co+1)*co/2;
		System.out.println(ans);
	}
	}