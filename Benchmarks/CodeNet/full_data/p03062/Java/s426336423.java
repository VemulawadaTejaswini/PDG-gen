import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		List<Long> list = Arrays.stream(sc.nextLine().split(" ",0)).map(Long::valueOf).collect(Collectors.toList());
		int count = 0;
		boolean hasZero = false;
		for (long i : list) {
			if (i == 0) {
				hasZero = true;
				break;
			} else if (i < 0) {
				count++;
			}
		}

		long out = list.stream().mapToLong(Math::abs).sum();
		if (! (hasZero || count%2 == 0) ) {
			long min = list.stream().mapToLong(Math::abs).min().getAsLong();
			out-= min*2;
		}

		System.out.println(out);
		sc.close();
	}

}