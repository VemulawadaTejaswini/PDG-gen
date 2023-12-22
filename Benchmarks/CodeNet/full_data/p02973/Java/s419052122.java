import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int j, tmp;
		ArrayList<Integer> nums = new ArrayList<>(0);
		for(int i=1; i<n; i++){
			tmp = Integer.parseInt(br.readLine());
			for(j=0; j<nums.size(); j++){
				if(nums.get(j) < tmp){
					nums.remove(j);
					break;
				}
			}
			nums.add(tmp);
		}
		System.out.println(nums.size());
	}
}
