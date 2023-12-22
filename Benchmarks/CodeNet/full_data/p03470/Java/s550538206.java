import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();//, b = sc.nextInt(),c=sc.nextInt();
		//int x=sc.nextInt();//,k=sc.nextInt();
		long sum=0,count=0,flag=0,max=-999999,min=99999;
		long[] array=new long[101];
		//String s=sc.next(),t=sc.next();
		String buff;
		//String[] arrays = new String[a];
		for(int i=0;i<a;i++) {
			array[sc.nextInt()]++;
		}
		for(int i=0;i<101;i++) {
			if(array[i]>=1)count++;;
		}
		System.out.println(count);



	}
	public static int sample(int n) {
		return n;
	}

}
