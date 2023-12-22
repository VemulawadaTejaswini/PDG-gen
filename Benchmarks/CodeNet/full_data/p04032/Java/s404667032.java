import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		int n = s.length();
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+2;j<n;j++)
			{
				String str = s.substring(i, j);
				Map<Character, Integer> map = new HashMap<>();
				for(int k=0;k<str.length();k++)
				{
					map.put(str.charAt(k), map.getOrDefault(str.charAt(k), 0)+1);
					if(map.get(str.charAt(k)) > str.length()/2)
					{
						System.out.println(i+" "+j);
						return;
					}
				}
			}
		}
		System.out.println(-1+" "+(-1));
	}
}
