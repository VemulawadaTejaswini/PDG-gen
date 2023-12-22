import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static int gcd(int a, int b){
        if(b == 0) return a;
        else return gcd(b , a%b);
    }

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		int[] num = new int[n];

		for(int i=0;i<n;i++) {
			num[i] = Integer.parseInt(str[i]);
		}

		int val = 0;
		if(num[0]>=num[1]) {
			val = gcd(num[0],num[1]);
		}else {
			val = gcd(num[1],num[0]);
		}

		for(int i=2;i<n;i++) {
			if(val>=num[i]) {
				val = gcd(val,num[i]);
			}else {
				val = gcd(num[i],val);
			}
		}

		System.out.println(val);

	}

}
