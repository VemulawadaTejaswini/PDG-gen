import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Hashtable;
import java.math.*;
public class Main {
	public static void main(String [] argv) throws Exception{
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int[] taka = new int[number];
		int[] aoki = new int[number];
		
		
		for(int i = 0; i < number; i ++) {
			taka[i] = in.nextInt();
			aoki[i] = in.nextInt();
		}

		int takaVotes = taka[0];
		int aokiVotes = aoki[0];
		for(int i = 1; i < number; i++) {
			while(taka[i] < takaVotes || aoki[i] < aokiVotes) {
				taka[i] += taka[i];
				aoki[i] += aoki[i];
			}
			
			takaVotes = taka[i];
			aokiVotes = aoki[i];
		}
		
		System.out.println(takaVotes + aokiVotes);
	} 


}

