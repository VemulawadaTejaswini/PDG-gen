import java.util.Scanner;
class frog1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		int du[]=new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		du[0]=0;
		du[1]=Math.abs(ar[1]-ar[0]);
		if(n>=3)
		{
			du[2]=Math.min(Math.abs(ar[2]-ar[0]),Math.abs(ar[2]-ar[1]));
		
		for(int i=3;i<n;i++)
		{
			du[i]=Math.min(Math.abs(ar[i]-ar[i-1])+du[i-1], Math.abs(ar[i]-ar[i-2])+du[i-2]);
		}
		}
     System.out.println(du[n-1]);
	}

}
