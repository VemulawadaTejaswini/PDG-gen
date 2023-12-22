import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		List<String> s = new ArrayList<String>();

		for(int i = 0;i<N;i++){
			s.add(br.readLine());
		}

		int M = Integer.parseInt(br.readLine());

		ArrayList<String> t = new ArrayList<String>();

		for(int i = 0;i<M;i++){
			t.add(br.readLine());
		}
		s.sort(null);
		t.sort(null);
		ArrayList<String> seen = new ArrayList<String>();
		int sum = 0;
		for(int i= 0;i<s.size();i++){
			if(!seen.contains(s.get(i))){
				seen.add(s.get(i));
				int point = 0;
				for(int p = 0;p<s.size();p++){
					if(s.get(i).equals(s.get(p))){
						point++;
					}
				}
				for(int m = 0;m<t.size();m++){
					if(s.get(i).equals(t.get(m))){
						point--;
					}
				}

				if(point>0 && sum<point)sum=point;
			}
		}

		System.out.println(sum);

	}

}