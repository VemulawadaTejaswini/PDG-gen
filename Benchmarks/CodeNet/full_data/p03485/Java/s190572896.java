//RoundUptheMean.java
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double a=sc.nextInt();
        double b=sc.nextInt();
        double average=(a+b)/2;
        double sum=Math.ceil(average);
        int ans=(int)sum;

        System.out.println(ans);
        sc.close();
    }
}