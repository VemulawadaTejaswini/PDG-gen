import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int M=in.nextInt();
		int[]arr=new int[N];
		int sum =0;
		int count=0;
		
		for (int i = 0; i < N; i++) {
			arr [i]=in.nextInt();
			sum=sum+arr[i];
		}
		double pop=(double)sum/(M*4);
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>=(pop))
				count++;
		}
		if(count>=M)
			System.out.println("Yes");
		else
			System.out.println("No");
		
	}
}
