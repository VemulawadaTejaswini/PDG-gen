import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] line = br.readLine().split(" ");
		int[] a = new int[N];
		int ave = 0;
		int sum = 0;
		for(int i=0;i<N;i++){
			a[i] = Integer.parseInt(line[i]);
			ave += a[i];
		}
		ave = (int)Math.ceil(((double)ave)/N);
		
		for(int i :a){
			sum += (i-ave)*(i-ave);
		}
		System.out.println(sum);
	}
}