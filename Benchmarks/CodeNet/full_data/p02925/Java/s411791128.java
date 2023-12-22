import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		ArrayList<ArrayDeque<Integer>> Date = new ArrayList<ArrayDeque<Integer>>();
		for(int i = 0;i < N;i++) {
			ArrayDeque<Integer> buf = new ArrayDeque<Integer>();
			for(int j = 0;j < N-1;j++) {
				buf.add(scn.nextInt()-1);
			}
			Date.add(buf);
		}

		boolean done[] = new boolean[N];
		boolean can = true,fin = false;
		int ans = 0;

		while(can && !fin) {
			can = false;
			Arrays.fill(done, false);
			for(int i = 0;i < N;i++) {

				if(done[i])continue;
				if(Date.get(i).isEmpty())continue;
				int ene = Date.get(i).peek();

				if(done[ene])continue;

				int me = Date.get(ene).peek();
				if(me != i)continue;
				Date.get(i).poll();
				Date.get(ene).poll();
				can = true;
				done[i] = true;
				done[ene] = true;
			}
			ans++;
			fin = true;
			for(int i = 0;i < N;i++) {
				fin &= Date.get(i).isEmpty();
			}

		}

		System.out.println((fin)?ans:-1);



	}

}
