package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int len = Integer.parseInt(sc.nextLine());
		String A = sc.nextLine();
		String B = sc.nextLine();
		int[] lineA = Stream.of(A.split(" ", 0)).mapToInt(Integer::parseInt).toArray();
		int[] lineB = Stream.of(B.split(" ", 0)).mapToInt(Integer::parseInt).toArray();
		int[] line =lineA.clone();
		A = A.replace(" ", "");
		B = B.replace(" ", "");

		Arrays.sort(line);

		boolean[] mapping = new boolean[len];

		Main main = new Main();
		ArrayList<String> permutaitions = new ArrayList<String>();
		main.permutation(line, len, mapping,0,new String[len], permutaitions);

		int[] ans = new int[2];
		for (int i = 0; i < permutaitions.size(); i++) {
			if (permutaitions.get(i).equals(A)) {
				ans[0] = i;
			}
			if (permutaitions.get(i).equals(B)) {
				ans[1] = i;
			}
		}
		System.out.println(Math.abs(ans[0]-ans[1]));
	}

	public void permutation(int[] line,int len,boolean[] mapping,int ite,String[] selectedArr,ArrayList<String> permutaitions) {
		//終了条件
		if (ite == len) {
			permutaitions.add(String.join("", selectedArr));
		}
		//再帰
		for (int i = 0; i < len; i++) {
			if (mapping[i] == false) {
				mapping[i] = true;
				selectedArr[ite] = Integer.toString(line[i]);
				permutation(line, len, mapping, ite + 1, selectedArr, permutaitions);
				mapping[i] = false;
			}
		}
		return;
	}


}