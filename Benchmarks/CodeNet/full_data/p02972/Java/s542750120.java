import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int a[]= new int[N+1];
		int ans[]= new int[N+1];
		for(int i=1;i<=N;i++){
		    a[i]=sc.nextInt();
		}
		int good=0;
		int sum=0;
		for(int i=1;i<=N;i++){
		    sum=0;
		    for(int b=i;b<=N;b=(b+1)*i){
		        sum=a[b]+sum;
		    }
		    if(sum%2==1){
		        ans[i]=1;
		        good++;
		    }
		}
		System.out.println(good);
		for(int i=1;i<=N;i++){
		    if(ans[i]==1){
		        System.out.print(i);
		    }
		}
	}
}