import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			List<String> vals = br.lines().limit(3).collect(Collectors.toList());
			List<List<Integer>> grid = new ArrayList<>();
			vals.stream().forEachOrdered(v -> {
				grid.add(splitBySpace(v).stream().map(s -> Integer.valueOf(s)).collect(Collectors.toList()));
			});
			
			for(int i = 0; i < grid.size()-1; i++){
				for(int j = i+1; j < grid.size(); j++){
					int sub = grid.get(i).get(0) - grid.get(j).get(0);
					for(int k = 1; k < grid.get(i).size(); k++){
						if(sub != grid.get(i).get(k) - grid.get(j).get(k)){
							System.out.println("No");
							return;
						}
					}
				}
			}
			System.out.println("Yes");
		}
	}


	private static List<String> splitBySpace(String target) {
		return Arrays.asList(target.split("\\s"));
	}

}
