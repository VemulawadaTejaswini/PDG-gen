import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(),x=sc.nextInt();//,k=sc.nextInt();
		int sum=0,count=0,flag=0,max=-999999,min=99999;
		int[] array=new int[101];
		//String[] array = new String[n];
		//String s=sc.next();//,t=sc.next();
		for(int i=0;i<m;i++) {
			array[sc.nextInt()]++;
		}
		for(int i=0;i<=x;i++) {
			sum+=array[i];
		}
		for(int i=x;i<n;i++) {
			count+=array[i];
		}

		System.out.println(Math.min(count, sum));
	}
	public static int sample(int n) {
		return n;
	}

}
