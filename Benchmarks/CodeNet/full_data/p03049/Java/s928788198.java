import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		new Main().run();
	}
	
	public void run() throws NumberFormatException, IOException
	{
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(file.readLine());
		char[][] strs = new char[N][];
		int b = 0;
		int ba = 0;
		int a = 0;
		int cnt = 0;
		for(int i = 0;i<N;i++)
		{
			strs[i] = file.readLine().trim().toCharArray();
			if(strs[i][0] == 'B'){
				if(strs[i][strs[i].length-1]=='A')
					ba++;
				else
					b++;
			}
			else if(strs[i][strs[i].length-1]=='A')
				a++;
			for(int j = 0;j<strs[i].length-1;j++)
			{
				if(strs[i][j]=='A' &&strs[i][j+1] == 'B')
					cnt++;
			}
		}
		if(a!=0)
		{
			a--;
			cnt+=ba;//now ends with a
			if(b!=0)
			{
				b--;
				cnt++;
			}
			cnt+=Math.min(a,b);
		}else if(ba!=0){
			cnt+=ba-1;
			if(b!=0)
				cnt++;
		}
		System.out.println(cnt);
	}
	
}
