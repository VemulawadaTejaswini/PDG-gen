import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {

		// setOut();

		long n = sc.nextLong();
		long p = sc.nextLong();
		Map<Long, Long> m = new HashMap<Long, Long>();
		long rest = p;
		long i = 2;
		while (i <= Math.sqrt(rest)) {
			if (rest % i == 0) {
				rest = rest / i;
				m.put(i, m.getOrDefault(i, (long) 0) + 1);
				continue;
			}
			i++;
		}
		m.put(rest, m.getOrDefault(i, (long) 0) + 1);
		long res = 1;

		for (long j : m.keySet()) {
			if (m.get(j) >= n) {
				long tmp = (long) Math.pow(j, m.get(j) / n);
				res *= tmp;
			}
		}
		System.out.print((long)res);

	}

}