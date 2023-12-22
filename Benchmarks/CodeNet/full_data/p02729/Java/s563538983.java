//TheNumberofEvenPairs.java
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        int m=sc.nextInt();

        int ans=0;
        //n
        if(n==1){
            ans+=0;
        }
        else{
            ans=(n*(n-1))/(2);
        }
        //m
        if(m==1){
            ans+=0;
        }
        else{
            ans+=m;
        }

        System.out.println(ans);
        sc.close();
    }
}