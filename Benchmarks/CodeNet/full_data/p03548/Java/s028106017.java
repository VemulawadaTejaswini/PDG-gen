import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int n=sc.nextInt();
		long x=sc.nextLong();
		long y=sc.nextLong();
		long z=sc.nextLong();
		//long k=sc.nextLong();
		//String s=sc.next();
		//long[] array=new long[n];
		int sum=0,buff,max=0,min=0;
		//int[] array=new int[l];
		//String s="",m="",h="";
		x=x-z;
		while(x>0) {
			x=x-(y+z);
			if(x<0)break;
			sum++;
			//if(x<=0)break;
		}
		//Arrays.sort(array)
		System.out.println(sum);
	}
}

//Arrays.sort(array, (a, b) -> Integer.compare(a[0], b[0]));


