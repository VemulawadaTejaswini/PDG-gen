import java.util.*;

public class Solution
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int m = a-1;
		int n = b-1;
		int result = ceil(n/m);
		System.out.println(result);
    }
}