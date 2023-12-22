import java.util.*;

public class Main{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int Q=sc.nextInt();	//0.25l
		int H=sc.nextInt();	//0.50l
		int S=sc.nextInt();	//1.0l
		int D=sc.nextInt();	//2.0l
		long N=sc.nextLong();	//Nlかう
		long ans=0,num;

		if(D<2*S){
			num=(N*100)/200;
			ans+=num*D;	//必要な金額
			N-=num*2;	//必要なアイスティーの残り量
		}
		if(S<2*H){
			num=(N*100)/100;
			ans+=num*S;
			N-=num*1;
		}
		if(H<2*Q){
			num=(N*100)/50;
			ans+=num*H;
			N-=num*0.50;
		}

		num=(int)(N*100)/25;
		ans+=num*Q;

		System.out.println(ans);

	}
}