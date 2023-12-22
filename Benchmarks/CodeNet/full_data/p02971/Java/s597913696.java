
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int input[] = new int[n];
		int copy[] = new int[n];
		
		int max = 0;
		for(int i = 0; i < n ; i++){
			input[i] = Integer.parseInt(br.readLine());
			max = Math.max(max, input[i]);
			copy[i] = input[i];
		}
		
		//最大値の出現回数を調べる
//		int maxAppear = 0;
//		for(int i = 0; i < n; i++){
//			if(input[i] == max){
//				maxAppear++;
//			}
//		}
		
		Arrays.sort(copy);
		
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < n; i++){
			if(input[i] == copy[n - 1]){
				sb.append(copy[n - 2]+"\n");
			}
			else {
				sb.append(copy[n - 1] + "\n");
			}
		}
		System.out.print(sb);
	}

}
