import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) throws Exception
	{
		new Main().run();
	}
	
	public void run() throws Exception
	{
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		char[] s = file.readLine().toCharArray();
		char[] t = file.readLine().toCharArray();
		TreeSet<Integer>[] sets = new TreeSet[26];
		for(int i =0 ;i<26;i++)
			sets[i] = new TreeSet<Integer>();
		for(int i = 0;i<s.length;i++)
		{
			sets[s[i]-'a'].add(i);
		}
		int current = 0;
		long sum = 0;
		for(int i = 0;i<t.length;i++)
		{
			int ch = t[i]-'a';
			if(sets[ch].isEmpty())
			{
				System.out.println(-1);
				return;
			}
			if(sets[ch].higher(current)!=null)
			{
				current = sets[ch].higher(current);
			}else {
				sum += s.length;
				current = sets[ch].first();
			}
		}
		System.out.println(sum+current+1);
	}
}
