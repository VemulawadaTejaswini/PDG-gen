import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int C = scan.nextInt();
		int K = scan.nextInt();
		int tempT = 0;
		int tempC = 0;
		int tempB = 0;
		int Ti = 0;
		ArrayList<Integer> array = new ArrayList<Integer>();
		while (scan.hasNext()){
			array.add(scan.nextInt());
		}
		Collections.sort(array);
		tempT = Ti + K;
		tempC = 1;
		tempB = 1;
		for (int i = 0; i < array.size(); i++) {
			Ti = array.get(i);
			if (tempC < C && Ti <= tempT){
				tempC++;
			} else {
				tempB++;
				tempC = 1;
				tempT = Ti + K;
			}
		}
		System.out.println(tempB);
	}
}
