import java.io.PrintWriter;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
	public static String implementation(List<String> array){
		List<Integer> list = Arrays.stream(array.get(0).split(" ")).map(s -> {
			return Integer.parseInt(s);
		}).collect(Collectors.toList());

		return Math.min(list.get(1), list.get(2)) + " " + Math.max(0, (list.get(1) + list.get(2) - list.get(0)));
	}

	public static void main(String[] args){
		// Input
		Scanner sc = new Scanner(System.in);

		// Read input and execute method
		String tmp;
		List<String> array = new ArrayList<String>();
		while(true) {
			try {
				tmp = sc.nextLine();
				if (tmp.length() == 0) {
					exec(array);
					array.clear();
				} else {
					array.add(tmp);
				}
			} catch (Exception e){
				exec(array);
				break;
			}
		}
	}

	public static void exec(List<String> array){
		// Output variable
		String out = implementation(array);

		// Output
		PrintWriter stdOut = new PrintWriter(System.out);
		stdOut.println(out);
		stdOut.flush();

		// Debug
		if(array.get(array.size()-1).startsWith("a:")) {
			if (!array.get(array.size() - 1).substring(2).equals(out)) {
				System.out.println("error included");
				System.out.println("output : " + out);
				System.out.println("expected : " + array.get(array.size()-1).substring(2));
			} else {
				System.out.println("correct answer!!");
			}
			System.out.println("");
		}
	}
}
