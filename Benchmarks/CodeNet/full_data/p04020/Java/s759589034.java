import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int answer = 0;
		int mod = 0;
		for(int i=0;i<n;i++){
			int num = Integer.parseInt(br.readLine());
			if(mod > 0 && num > 0){
				answer += 1;
				num -= 1;
			}
			answer += num/2;
			mod = num%2;
		}
		System.out.println(answer);
	}
}
