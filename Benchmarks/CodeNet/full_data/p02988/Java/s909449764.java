import java.io.BufferedReader;
import java.io.InputStreamReader;

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
		int count = 0;
		for(int i=1;i<s.length-1;i++) {
			if((nums[i-1]<nums[i]&&nums[i]<nums[i+1])||(nums[i+1]<nums[i]&&nums[i]<nums[i-1])) {
				count++;
			}
		}
		print(count);
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