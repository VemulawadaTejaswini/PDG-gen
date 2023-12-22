import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] line = br.readLine().split(" ");
		int[] nums = new int[n];
		int i;
		for(i=0; i<n; i++)
			nums[i] = Integer.parseInt(line[i]);
		
		if( n%3 != 0 ){
			System.out.println("No");
			System.exit(0);
		}
		
		int[] baseNums = new int[]{-1, -1, -1};
		int[] count = new int[3];
		for(Integer num : nums){
			for(i=0; i<3; i++){
				if( baseNums[i] == num ){
					count[i]++;
					break;
				}else if( baseNums[i] == -1 ){
					baseNums[i] = num;
					count[i] = 1;
					break;
				}
			}
			if( i == 3 ){
				System.out.println("No");
				System.exit(0);
			}
		}
		
		System.out.println( count[0] == count[1] && count[1] == count[2] ? "Yes" : "No");
	}
}
