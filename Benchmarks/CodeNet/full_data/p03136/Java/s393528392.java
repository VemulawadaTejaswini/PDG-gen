import java.util.Scanner;


public class Main {
	public static void main (String[] args){
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int[] l= new int[n];
		
		String ans="";
		
		int max=0;
		int sum=0;
		
		for(int i=0;i<n;i++){
			l[i]=sc.nextInt();
			sum=sum+l[i];
			if(max<l[i])max=l[i];
		}
		
		if(sum-max>max)ans="Yes";
		else ans="No";
		
		
		System.out.println(ans);
	}

}
