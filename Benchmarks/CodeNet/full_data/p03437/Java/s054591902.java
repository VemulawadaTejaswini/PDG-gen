import java.math.BigInteger;
import java.util.*;

public class bbb
{

    public  static void main(String args[])
    {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		if(a % b == 0)
		{
			System.out.println("-1");
		}else
		{
			System.out.printf("%d\n",a);
		}
    }
}