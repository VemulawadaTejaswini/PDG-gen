import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		int w=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		long cnt=0;
		
		for(int i=0;i<h-a;i++){
			cnt+=(fact(b-1+i)/(fact(b-1)*fact(i)))*(fact(w-b-1+h-i-1)/(fact(w-b-1)*fact(h-i-1)));
		}
		
		System.out.println(cnt%(100000000+7));
	}
	public static int fact(int n){
		if(n==1 || n==0)return 1;
		else{
			return n*fact(n-1);
		}
	}
}
