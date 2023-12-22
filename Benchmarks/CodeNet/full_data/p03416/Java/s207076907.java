import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tmp = br.readLine().split(" ");
		String A = tmp[0];
		String B = tmp[1];

		int ans = 0;
		for(int i = Integer.parseInt(A);i<=Integer.parseInt(B);i++){
			if(kaibun(String.valueOf(i)))ans++;
		}
		System.out.println(ans);
	}

	static boolean kaibun(String n){
		char a = n.charAt(0);
		char b = n.charAt(1);
		char aa = n.charAt(4);
		char bb = n.charAt(3);

		if(a == aa && b == bb)return true;
		else return false;
	}

}
