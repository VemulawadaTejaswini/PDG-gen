public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
        BufferedReader stdReader =
            new BufferedReader(new InputStreamReader(System.in));
        String[] nums = stdReader.readLine().split(" ");
        int[] a = {Integer.parseInt(nums[0]), Integer.parseInt(nums[1]), Integer.parseInt(nums[2])};
        Arrays.sort(a);
        System.out.println(a[0] + " " + a[1] + " " + a[2]);
	}
}
