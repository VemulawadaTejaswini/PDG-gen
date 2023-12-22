import java.util.Scanner;
import java.util.Arrays;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int h[]=new int[n];
        for(int i=0; i<n; i++){
            h[i]=sc.nextInt();
        }
        Arrays.sort(h);
        int sum=0;
        for(int j=0; j<n-k; j++){
            sum+=h[j];
        }
        System.out.println(sum);
        sc.close();
    }
}