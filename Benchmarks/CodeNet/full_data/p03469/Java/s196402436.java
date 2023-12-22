//Already2018.java
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        String s=sc.next();
        
        System.out.println(2018+s.substring(4,10));
        sc.close();
    }
}