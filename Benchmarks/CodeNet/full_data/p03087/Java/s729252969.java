
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {


	public static void main(String[] args) throws IOException {
		BufferedReader bf = null;
		bf = new BufferedReader(new InputStreamReader(System.in));
		int n,q,l,r,ans;
		String str;
		String[] s,stemp;
		LinkedList<Integer> list = new LinkedList<Integer>();
		str = bf.readLine();
		stemp = str.split(" ");
		n = Integer.parseInt(stemp[0]);
		q = Integer.parseInt(stemp[1]);
		str = bf.readLine();
		s = str.split("");
		for(int i = 0;i < n-1;++i) {
			if(s[i].equals("A") && s[i+1].equals("C")) {
				list.add(i);
			}
		}
		for(int i = 0;i < q;++i) {
			str = bf.readLine();
			stemp = str.split(" ");
			l = Integer.parseInt(stemp[0])-1;
			r = Integer.parseInt(stemp[1])-1;
			ans = 0;
			for(Integer temp:list) {
				if(l <= temp) {
					if(temp+1 <= r) {
						ans++;
					} else {
						break;
					}
				}
			}
			System.out.println(ans);
		}
	}
}