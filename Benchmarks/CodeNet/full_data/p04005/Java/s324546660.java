
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String str = input.readLine( );
		String[] strlist = str.split(" ");
		long a = Long.parseLong(strlist[0]);
		long b = Long.parseLong(strlist[1]);
		long c = Long.parseLong(strlist[2]);

		long[] answer = new long[3];
		answer[0] = min(a,b,c);
		answer[1] = min(b,c,a);
		answer[2] = min(c,a,b);

		Arrays.sort(answer);

		System.out.println(answer[0]);
	}

	public static long min(long a, long b, long c){
		long answer;
		long[] list = new long[(int) (a-1)];
		for(int i=1; i<a; i++){
			list[i-1] = (a-i) - i;
			if(list[i-1] < 0){
				list[i-1] = -list[i-1];
			}
		}
		Arrays.sort(list);
		answer = list[0] * b * c;
		return answer;
	}
}
