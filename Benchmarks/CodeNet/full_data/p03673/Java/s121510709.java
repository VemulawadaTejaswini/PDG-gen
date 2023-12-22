package project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		List<Integer> a = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			a.add(scanner.nextInt());
			Collections.reverse(a);
		}

		for (int tar : a) {
			System.out.println(tar);
		}

	}
}
