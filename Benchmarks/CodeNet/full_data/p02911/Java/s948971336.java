import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] nums = input.split(" ");
		int N = Integer.parseInt(nums[0]);
		int K = Integer.parseInt(nums[1]);
		int Q = Integer.parseInt(nums[2]);
		int[] decrement_scores = new int[N];
		for(int i = 0; i < N; i++){
			decrement_scores[i] = 0;
		}
		for(int i = 0; i < Q; i++){
			decrement_scores[Integer.parseInt(br.readLine())-1] += 1; 
		}

		//output Winner
		String reslut;
		for(int i = 0; i < N; i++){
			if(Q-decrement_scores[i] >= K){
				reslut = "No";
			} else {
				reslut = "Yes";
			}
			System.out.println(reslut);
		}
	}
}