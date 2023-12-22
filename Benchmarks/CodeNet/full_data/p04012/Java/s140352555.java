import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		
		String[] str = N.split("");
		
		for(int i=0; i<str.length; i++){
			if(strCnt(str, str[i])%2 != 0){
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
	
	static int strCnt(String[] str, String x){
		int cnt=0;
		for(int i=0; i<str.length; i++){
			if(str[i].equals(x)){
				cnt++;
			}
		}
		return cnt;
	}
}