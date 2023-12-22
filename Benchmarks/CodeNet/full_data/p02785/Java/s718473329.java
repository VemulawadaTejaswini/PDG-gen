import java.util.*;
public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long n=in.nextLong(),c=0,s=0;
		long k=in.nextLong();
		long[] arr=new long[(int)n];
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
			s=s+arr[i];
		}
		if(k>=n)
		{
			System.out.println("0");
			System.exit(0);
		}
		Arrays.sort(arr);
		long mid=n-1;
		while(c!=k)
		{
			s=s-arr[(int)mid];
			mid--;
			c++;
		}
		System.out.println(s);
	}
}