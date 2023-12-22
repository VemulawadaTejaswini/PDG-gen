import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		Map<String, String> tmp = new HashMap<String, String>();
		for(String s : args){
			tmp.put(s, s);
		}
		System.out.println(tmp.size());
	}
}
