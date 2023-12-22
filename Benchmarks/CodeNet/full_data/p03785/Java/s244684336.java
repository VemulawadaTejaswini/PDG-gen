import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		long c = Long.parseLong(str[1]);
		long k = Long.parseLong(str[2]);

		Person p[] = new Person[n];
		for (int i = 0; i < n; i++) {
			long t = Long.parseLong(br.readLine());

			p[i] = new Person(t, t + k);
		}

		Arrays.sort(p);
		long ans = 0;

		for (int i = 0; i < n;) {
			long end = p[i].end;
			long count = 1;
			int j = i + 1;

			while (count < c && j < n) {

				if (p[j].end >= end && p[j].start <= end) {
					count++;
					j++;
				} else {
					break;
				}
			}
			ans++;
			i = j;
		}

		System.out.println(ans);
	}
}

class Person implements Comparable<Person> {
	long start;
	long end;

	public Person(long start, long end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public int compareTo(Person p) {
		return Long.compare(this.end, p.end);
	}
}
