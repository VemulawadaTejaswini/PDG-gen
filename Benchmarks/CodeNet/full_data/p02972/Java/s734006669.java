import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int i;
		int[] array = new int[n];
		String[] line = br.readLine().split(" ");
		for(i=0; i<n; i++)
			array[i] = Integer.parseInt(line[i]);
		
		int[] result = new int[n];
		int j;
		int m = 0;
		ArrayList<String> resultNums = new ArrayList<>(0);
		for(i=n; 0<i; i--){
			for(j=i; j<=n; j+=i)
				result[i-1] += result[j-1];
			result[i-1] %= 2;
			if(array[i-1] != result[i-1])
				result[i-1] = 1;
			if(array[i-1] == 1){
				m++;
				resultNums.add(Integer.toString(i));
			}
		}
		
		System.out.println(m);
		System.out.println(String.join(" ", resultNums));
	}
}
