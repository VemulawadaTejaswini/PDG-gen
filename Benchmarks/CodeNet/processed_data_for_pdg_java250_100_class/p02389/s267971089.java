public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader stdReader =
            new BufferedReader(new InputStreamReader(System.in));
        String[] nums = stdReader.readLine().split(" ");
        int a = Integer.parseInt(nums[0]);
        int b = Integer.parseInt(nums[1]);
        System.out.println(a*b + " " + 2*(a+b) );
	}
}
