package pro.ryutans.atcoder.practicecontest.no1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			List<String> vals = br.lines().limit(2).collect(Collectors.toList());
			int n = Integer.valueOf(vals.get(0));
			int a = Integer.valueOf(vals.get(1));
			int zan = n % 500;
			if(zan <= a) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}


	private static List<String> splitBySpace(String target) {
		return Arrays.asList(target.split("\\s"));
	}

}
