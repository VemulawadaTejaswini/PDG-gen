import java.util.Scanner;
class xxx
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int ans=1,n,k;
        n=input.nextInt();
        k=input.nextInt();
        for(int i=1; i<=n; i++)
        {
            ans+= ans<=k? ans:k;
        }
        System.out.println(ans);
    }
}