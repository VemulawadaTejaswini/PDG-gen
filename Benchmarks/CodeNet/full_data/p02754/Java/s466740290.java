import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();

        if(a==0){
            System.out.println(0);
        }
        else{
            System.out.println(a+(n-(a+b)));
        }
        sc.close();
    }
}