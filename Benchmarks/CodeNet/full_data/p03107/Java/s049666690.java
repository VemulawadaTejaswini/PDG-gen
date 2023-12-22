import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

		m(cube, 0);

		System.out.println(res);
	}

	private static void m(List<Character> z, int count){
		for(int i = 0; i < z.size() - 1; i++){
			char a = z.get(i);
			char b = z.get(i + 1);
			if(! Objects.equals(a, b)){
				z.remove(i);
				z.remove(i);
				res += 2;
			}
		}

		if(! (count >= (10^5)/2)){
			m(z, count + 1);
		}
	}
}
