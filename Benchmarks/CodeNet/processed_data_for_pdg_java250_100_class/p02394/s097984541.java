public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
        BufferedReader stdReader =
            new BufferedReader(new InputStreamReader(System.in));
        String[] nums = stdReader.readLine().split(" ");
        int[] a = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
        	a[i] = Integer.parseInt(nums[i]);
        }
        if( (a[2] - a[4]) < 0 		||
        	(a[3] - a[4]) < 0		||
        	(a[2] + a[4]) > a[0] 	||
        	(a[3] + a[4]) > a[1] 	){
        	System.out.println("No");
        } else {
        	System.out.println("Yes");
        }
	}
}
