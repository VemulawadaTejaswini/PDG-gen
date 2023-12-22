package prcn_plac;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());

		int[] ary = {x + y, x - y, x * y};
		int max;
		if(ary[0] < ary[1]) {
			max = ary[1];
			max = Math.max(max, ary[2]);
		} else {
			max = ary[0];
			max = Math.max(max, ary[2]);
        }
        System.out.println(max);
	}
}
