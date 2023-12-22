import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine());
		int X = Integer.parseInt(stk.nextToken());
		int Y = Integer.parseInt(stk.nextToken());
		int rta = 0;
		if(X > Y){
			if(X < 0 && Y < 0)
				rta+=1;
			rta += Math.abs(Math.abs(X) - Math.abs(Y));
			rta+=1;
		}
		else if(X < Y){
			if(X < 0 && Y > 0)
				rta+=1;
			rta += Math.abs(Math.abs(X) - Math.abs(Y));
		}
		if(X == 0 || Y == 0)
			rta = Math.abs(Math.abs(X) - Math.abs(Y));
		System.out.println(rta);
	}

}