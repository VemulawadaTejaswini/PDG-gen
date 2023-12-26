public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
        BufferedReader stdReader =
            new BufferedReader(new InputStreamReader(System.in));
        String[] nums = stdReader.readLine().split(" ");
        int a = Integer.parseInt(nums[0]);
        int b = Integer.parseInt(nums[1]);
        if(a > b) {
        	System.out.println("a > b");
        } else if(a < b) {
        	System.out.println("a < b");
        } else {
        	System.out.println("a == b");
        }
	}
}
