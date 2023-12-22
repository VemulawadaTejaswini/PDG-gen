import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int K=stdIn.nextInt();
		int a[]=new int[N];
		long b[]=new long[N];
		long ans=-1;
		for(int i=0;i<N;i++){
			a[i]=stdIn.nextInt();
		}
		for(int i=0;i<Math.pow(2,N-1);i++){
			int x=i,cout=1;
			long sum=0,max=a[0];
			b[0]=a[0];
			for(int j=1;j<N;j++){
				b[j]=a[j];
				if(x%2==1&&max>=b[j]){
					max++;
					sum+=max-b[j];
					b[j]=max;cout++;
				}
				if(b[j]>max){
					cout++;
					max=b[j];
				}
				x/=2;
			}
			if(cout>=K&&sum<ans)
				ans=sum;
			if(cout>=K&&ans==-1)
				ans=sum;
		}
		System.out.println(ans);
	}
}
