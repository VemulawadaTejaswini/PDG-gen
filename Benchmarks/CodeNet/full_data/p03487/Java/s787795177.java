import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

class GoodSequence {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		StringTokenizer st=new StringTokenizer(br.readLine());
		HashMap<Integer, Integer> hm=new HashMap<>();
		for(int i=0;i<N;i++)
		{
			int key=Integer.parseInt(st.nextToken());
			hm.put(key, hm.getOrDefault(key, 0)+1);
		}
		
		int ans=0;
		for (Integer key: hm.keySet()) {
			if(hm.get(key)<key)
				ans+=hm.get(key);
			else
			ans+=Math.abs(hm.get(key)-key);
		}
		
		System.out.println(ans);
	}

}
