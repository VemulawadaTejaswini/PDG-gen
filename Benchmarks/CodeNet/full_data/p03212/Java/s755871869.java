
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	
	static long n = 0;

	public static void main(String[] args) throws Exception {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			n = Long.parseLong(br.readLine());
			System.out.println(get("0"));
		}
	}
	
	public static int get(String a) {
		boolean[] bools = {false, false, false};
		List<String> num = new ArrayList<>(Arrays.stream(a.split(""))
				.filter(n -> !n.equals("0")).collect(Collectors.toList()));
		int count = 0;
		
		if(Long.parseLong(a) > n) return 0;
		
		for (String s : num) {
			int i = Integer.parseInt(s);
			if(i == 3) bools[0] = true;
			else if(i == 5) bools[1] = true;
			else if(i == 7) bools[2] = true;
			else {
				bools[0] = false;
				break;
			}
		}
		if(bools[0] && bools[1] && bools[2]) count++;
		if(Long.parseLong(a) == 0) a = "";
		
		for (String ss : "357".split("")) {
			count += get(a + ss);
		}
		return count;
		
	}

}
