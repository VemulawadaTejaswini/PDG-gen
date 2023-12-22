import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer output = 0;

		Integer kInteger = new Integer(scanner.next());
		Integer sInteger = new Integer(scanner.next());

		for(int x = 0;x<=kInteger;x++) {
			for(int y = 0;y<=kInteger;y++) {
				for(int z = 0;z<=kInteger;z++) {
					if(sInteger == (x+y+z)) {
						output++;
					}
				}
			}
		}
		System.out.println(output);
		scanner.close();
	}
}