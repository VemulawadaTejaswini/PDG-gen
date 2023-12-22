import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	static BufferedReader reader;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reader = new BufferedReader(new InputStreamReader(System.in));
		String[] s = readLine();
		int[] nums = new int[Integer.parseInt(s[0])];
		s = readLine();
		for(int i=0;i<s.length;i++) {
			nums[i]=Integer.parseInt(s[i]);
		}
		Arrays.sort(nums);
		int N = nums.length;
		print(nums[N/2]-nums[N/2-1]);
	}

	private static String[] readLine(){
		try{
			return reader.readLine().split(" ");
		}catch(Exception e){
			e.printStackTrace();
			return new String[]{e.getMessage()};
		}
	}
	private static void print(Object o){
		System.out.println(o);
	}
	private static void print(){
		System.out.println();
	}
}
