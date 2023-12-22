import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{

	public static void main(String[] args) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String[] input = br.readLine().split(" ");
       int n = Integer.parseInt(input[0]);
       int k = Integer.parseInt(input[1]);
       int[] cnt = new int[1000000+1];
       for(int i = 0;i < n;i++){
       	input = br.readLine().split(" ");
       	cnt[Integer.parseInt(input[0])] += Integer.parseInt(input[1]);
       }
       for(int i = 1;i < 100000+1;i++){
       	if(k <= cnt[i]){
       		System.out.println(i);
       		break;
       	}
       	k -= cnt[i];
       }
   }
       

}