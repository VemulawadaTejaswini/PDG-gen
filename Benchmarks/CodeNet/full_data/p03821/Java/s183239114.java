import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		
		int[] a=new int[N];
		int[] b=new int[N];
		int count=0;
		
		for(int i=0;i<N;i++){
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
		}
		for(int i=N-1;i>=0;i--){
			
			count+=baisuu(a[i],b[i]);
			
			for(int j=0;j<=i;j++){
				a[j]+=baisuu(a[i],b[i]);
			}
		}
		System.out.println(count);
	}
	
	static int baisuu(int a,int b){
		if(a<b) return b-a;
		else if(a%b==0) return 0;
		else{
			return b-a%b;
		}
	}
}
