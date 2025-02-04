import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] s = br.readLine().split("\\s+");
		int m = Integer.parseInt(s[0]);
		int n = Integer.parseInt(s[1]);
		long res = n;
		for(int i=1;i<m;i++)
		{
			res *= n-1;
			if(res > Math.pow(2, 31)-1)
			{
				System.out.println((long)Math.pow(2, 31)-1);
				return;
			}
		}
		System.out.println(res);
	}
}