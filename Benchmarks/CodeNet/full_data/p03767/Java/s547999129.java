import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> alist = new ArrayList<Integer>();
		long answer = 0;

		for( String str:br.readLine().split(" ") ){
			alist.add(Integer.parseInt(str));
		}
		Collections.sort(alist, Comparator.reverseOrder());

		for(int i=0;i<n;i++){
			int num = (2*i)+1;
			answer += alist.get(num);
		}

		System.out.println(answer);
	}
}
