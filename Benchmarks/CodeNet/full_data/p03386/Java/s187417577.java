import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong(), b = sc.nextLong();
		int k=sc.nextInt();//,k=sc.nextInt();
		int sum=0,count=0,flag=0,max=-999999,min=99999;
		long[] array=new long[k];
		//String[] array = new String[n];
		//String s=sc.next();//,t=sc.next();
		for(long i=0;i<k;i++) {
			System.out.println(a+i);
		}
		for(int i=0;i<k;i++) {
			array[i]=b-i;
		}
		Arrays.sort(array);
		for(int i=0;i<k;i++) {
			System.out.println(array[i]);
		}
		//System.out.println(Math.min(count, sum));
	}
	public static int sample(int n) {
		return n;
	}

}
