import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		long n=sc.nextInt();
        long a=sc.nextInt();
        long b=sc.nextInt();

        if(a==0){
            System.out.println(0);
        }
        else{
            System.out.print(a+(n-(a+b)));
        }
        sc.close();
    }
}