import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main{

	private static int res = 0;

	public static void main(String[] args){
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);

		String str = null;
		try{
			str = br.readLine();
		}catch(IOException ex){
			ex.printStackTrace();
		}

		if(str == null)
			return;

		List<Character> cube = new ArrayList<>();

		for(char c : str.toCharArray()){
			cube.add(c);
		}

		cube = cube.stream()
				.filter(s -> s.equals('0'))
				.collect(Collectors.toList());
		int zero = cube.size();
		int one = str.length() - zero;
		
		System.out.println(Math.min(one, zero) * 2);
	}
}
