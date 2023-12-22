import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		long n=sc.nextInt();
        long a=sc.nextInt();
        long b=sc.nextInt();
        long sum1=0;
        long sum2=0;
      
        sum1=n/(a+b);
        sum2=n-sum1*(a+b);
        if(sum2<a){
            System.out.println((a*sum1)+sum2);
        }
        else{
            System.out.println((a*sum1)+a);
        }
        sc.close();
    }
}