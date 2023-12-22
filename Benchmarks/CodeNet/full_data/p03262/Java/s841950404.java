import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strs = br.readLine().split(" ");
		int n = Integer.parseInt(strs[0]);
		int  ref= Integer.parseInt(strs[1]);
		strs = br.readLine().split(" ");
		int[] px = new int[n];
		for(int i = 0 ; i < n ; i++){
			px[i] = Math.abs(Integer.parseInt(strs[i]) - ref);
		}
		
		if(n == 1){
			System.out.println(px[0]);
			return;
		}
		
		int sample = px[n/2];
		ArrayList<Integer> ats = new ArrayList<Integer>();
		for(int i = 1 ; i <= sample ; i++){
			if(sample % i == 0){
				ats.add(i);
			}
		}
		for(int p:px){
			for(int i = 0 ; i < ats.size() ; i++){
				int at = ats.get(i);
				if(p % at != 0){
					ats.remove(i);
				}
			}
		}
		
		int max = 0;
		for(int at:ats){
			max = (max < at) ? at : max;
		}
		System.out.println(max);
	}
}
