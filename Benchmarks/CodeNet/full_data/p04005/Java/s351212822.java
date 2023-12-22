
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String str = input.readLine( );
		String[] strlist = str.split(" ");
		int a = Integer.parseInt(strlist[0]);
		int b = Integer.parseInt(strlist[1]);
		int c = Integer.parseInt(strlist[2]);

		int[] answer = new int[3];
		answer[0] = min(a,b,c);
		answer[1] = min(b,c,a);
		answer[2] = min(c,a,b);

		Arrays.sort(answer);

		System.out.println(answer[0]);
	}

	public static int min(int a, int b, int c){
		int answer;
		int[] list = new int[a-1];
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
