import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int sum=n/k;
        int ans=1;

        for(int i=0; i<n; i++){
            sum=sum/k;
            ans++;
            if(sum<k){
                ans++;
                break;
            }
        }
        sc.close();
        System.out.println(ans);
    }
}