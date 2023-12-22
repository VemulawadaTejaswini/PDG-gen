import java.io.*;
public class Main {
	static void decrement(int num, int[] scores, int size){
	    for(int i = 0; i < size; i++){
	    	scores[i]--;
	    }
	    scores[num-1]++;
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] nums = input.split(" ");
		int N = Integer.parseInt(nums[0]);
		int K = Integer.parseInt(nums[1]);
		int Q = Integer.parseInt(nums[2]);
		int[] scores = new int[N];
		//initialize all player's score
		for(int i = 0; i < N; i++){
			scores[i] = K;
		}

		//decrement score
		for(int i = 0; i < Q; i++){
			decrement(Integer.parseInt(br.readLine()), scores, N);
		}

		//output Winner
		String reslut;
		for(int i = 0; i < N; i++){
			if(scores[i] <= 0){
				reslut = "No";
			} else {
				reslut = "Yes";
			}
			System.out.println(reslut);
		}

	}
}