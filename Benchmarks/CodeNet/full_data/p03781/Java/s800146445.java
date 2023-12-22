import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Hashtable;
//https://vjudge.net/contest/159423#problem/B
public class Main {
	public static void main(String [] argv) throws Exception{
		// lucky: only contain digits 4, 7.
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		//0 to infinity
		//between time i-1 and time i, can stay, or jump i spots left or right
		boolean solved = false;
		int  timeLimit = -1;
		while(solved == false) {
			timeLimit++;
			solved = jump(a, timeLimit, 0);
		}
		System.out.println(timeLimit);
	} 
	
	static boolean jump(int position, int timeLimit, int time) {
		
		if(position == 0) {
			return true;
		} else if (time >= timeLimit) {
			return false;
		} else {
		
			return jump(position - (time + 1), timeLimit, time + 1) 
					|| jump(position, timeLimit, time + 1) 
					|| jump(position + time + 1, timeLimit, time + 1);
		}
	}

}
