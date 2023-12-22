import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public interface Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		long sum = 0; 
		int count = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] array = new int[n];
		for(int i = 0; i < n; i++) {
			int x = Integer.parseInt(st.nextToken());
			if(x < 0)
				count++;
			sum += (array[i] = Math.abs(x));
		}
		
		count %= 2;
		if(count == 1) {
			Arrays.sort(array);
			sum -= array[0];
		}
		
		System.out.println(sum);
	}
}
