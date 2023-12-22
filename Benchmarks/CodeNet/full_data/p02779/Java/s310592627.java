import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		List<String> list = new ArrayList<>();

		for(int i = 0; i < N; i++) {
			list.add(scan.next());
		}

		List<String> fillteredList = list.stream().distinct().collect(Collectors.toList());

		System.out.println(fillteredList.size());
		System.out.println(list.size());
		if(fillteredList.size() == list.size()) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}
}