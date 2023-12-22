import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		int[] count = new int[26];
		for(int i=0;i<s.length();i++)
			count[s.charAt(i)-97]++;
		for(int i=0;i<26;i++)
		{
			if(count[i]%2 == 1)
			{
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}