import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input	 = in.readLine();
		String S	 = in.readLine();

		int N = Integer.parseInt(input.split(" ")[0]);

		int[] s = new int[N];
		int R=0;
		int G=0;
		int B=0;

		for(int i = 0;i<N;i++) {
			if(S.charAt(i)=='R') {
				s[i]=0;
				R++;
			}else if(S.charAt(i)=='G') {
				s[i]=1;
				G++;
			}else {
				s[i]=2;
				B++;
			}
		}
		int ans=R*G*B;

		for(int i = 0; i<N; i++) {
			for(int j=1;i+2*j<N;j++) {
				if(s[i]!=s[i+j] && s[i+j]!=s[i+2*j] && s[i]!=s[i+2*j]) {
					ans--;
				}
			}
		}

		System.out.println(ans);
	}
	}