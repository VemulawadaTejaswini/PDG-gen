import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int M=stdIn.nextInt();
		long ans=0,buf=0,sum=0;
		for(int i=0;i<M;i++){
			long d=stdIn.nextLong();
			long c=stdIn.nextLong();
			sum=d*c;
			ans+=c-1;
			if(i!=0){
				sum+=buf;ans++;
			}
			while(true){
				if(sum<10){
					buf=sum;
					break;
				}
				long a=0;
				while(true){
					a+=sum%10;
					sum/=10;
					ans++;
					if(sum<10)
						break;
				}
				sum=a;
			}
		}
		System.out.println(ans);
	}
}
