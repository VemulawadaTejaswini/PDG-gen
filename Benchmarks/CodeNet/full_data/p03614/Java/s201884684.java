import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int p[]=new int[N];
		int ans=0;
		for(int i=0;i<N;i++){
			p[i]=stdIn.nextInt()-1;
		}
		for(int i=0;i<N-1;i++){
			if(p[i]==i){
				int k=p[i];
				p[i]=p[i+1];
				p[i+1]=k;
				ans++;
			}
		}
		if(p[N-1]==N-1)
			ans++;
		System.out.println(ans);
	}
}
