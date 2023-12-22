
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


	public static void main(String[] args) throws IOException {
		BufferedReader bf = null;
		bf = new BufferedReader(new InputStreamReader(System.in));
		int ans = 0,temp = 0;
		String str;
		String[] s;
		str = bf.readLine();
		s = str.split("");
		for(int i = 0;i < s.length;++i) {
			switch(s[i]) {
			case "A":
			case "T":
			case "G":
			case "C":
				temp++;
				break;
			default:
				if(ans < temp) {
					ans = temp;
				}
				temp = 0;
			}
		}
		if(ans < temp) {
			ans = temp;
		}
		System.out.println(ans);
	}
}