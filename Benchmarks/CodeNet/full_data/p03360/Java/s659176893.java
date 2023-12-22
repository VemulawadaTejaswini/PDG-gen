import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int k=sc.nextInt();

		int max=a;
		int ans=0;

		if(a<b && b>c) max=b;
		else if(a<c && b<c) max=c;

		int max_i=max;

		for(int i=0;i<k;i++){
			max=2*max;
		}

		ans=max+(a+b+c-max_i);

		System.out.println(ans);
	}
}