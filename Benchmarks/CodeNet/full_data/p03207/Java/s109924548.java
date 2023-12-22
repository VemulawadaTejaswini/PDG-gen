import java.util.*;

public class Main{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		int p[]=new int[n];
		for(int i=0;i<n;i++){
			p[i]=sc.nextInt();
		}

		int total=0;
		Arrays.sort(p);
		for(int i=0;i<n-1;i++){
			total+=p[i];
		}
		System.out.println(total+p[n-1]/2);

	}
}
