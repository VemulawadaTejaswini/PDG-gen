import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long[] line = Stream.of(sc.nextLine().split(" ", 0)).mapToLong(Long::parseLong).toArray();
		if (line[1] == 0) {
			System.out.println(0);
		}else if (line[2] == 0) {
			System.out.println(line[0]);
		}else {
			long div = line[0] / (line[1] + line[2]);
			long mod = line[0] % (line[1] + line[2]);
			long add = 0;
			if (mod > line[1]) {
				add += line[1];
			}else {
				add += mod;
			}
			System.out.println(line[1] * div + add);
		}

	}



}