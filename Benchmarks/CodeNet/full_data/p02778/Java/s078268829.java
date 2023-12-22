import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int a=s.length();

        for(int i=0; i<a; i++){
            System.out.print('x');
        }
        sc.close();
    }
}