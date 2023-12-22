import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int a = sc.nextInt(), b = sc.nextInt(),c=sc.nextInt();
		//int x=sc.nextInt();//,k=sc.nextInt();
		long sum=0,count=0,flag=0,max=-999999,min=99999;
		//long[] array=new long[a];
		String s=sc.next(),t=sc.next();
		String buff;
		//String[] arrays = new String[a];
		count=Integer.parseInt(s+t);
		double g =Math.sqrt(count);
		sum=(int)g;
		if(g-sum==0)System.out.println("Yes");
		else System.out.println("No");



	}
	public static int sample(int n) {
		return n;
	}

}
