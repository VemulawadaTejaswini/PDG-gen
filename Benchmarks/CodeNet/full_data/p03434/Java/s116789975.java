
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
			List<Integer> a = splitBySpace(vals.get(1)).stream().map(v -> Integer.valueOf(v)).collect(Collectors.toList());
			
			int alice = 0;
			int bob = 0;
			while(a.size() != 0){
				int value = a.stream().mapToInt(v -> v).max().getAsInt();
				alice += value;
				a.remove((Integer)value);
				if(a.size() == 0){
					break;
				}
				value = a.stream().mapToInt(v -> v).max().getAsInt();
				bob += value;
				a.remove((Integer)value);
			}
			
			System.out.println(alice - bob);
		}
	}


	private static List<String> splitBySpace(String target) {
		return Arrays.asList(target.split("\\s"));
	}

}
