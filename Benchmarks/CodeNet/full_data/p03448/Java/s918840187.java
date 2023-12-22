import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(),c=sc.nextInt();
		int x=sc.nextInt();//,k=sc.nextInt();
		long sum=0,count=0,flag=0,max=-999999,min=99999;
		long[] array=new long[a];
		//String s=sc.next();//,t=sc.next();
		String buff;
		//String[] arrays = new String[a];
		for(int i=0;i<=a;i++) {
			for(int j=0;j<=b;j++) {
				for(int k=0;k<=c;k++) {
					sum=i*500+j*100+50*k;
					if(sum==x)count++;
				}
			}
		}

		System.out.println(count);

	}
	public static int sample(int n) {
		return n;
	}

}
