import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String result = "";
		for(int i = 0; i < str.length(); i++) {
			switch(str.substring(i, i+1)) {
				case "0":
					result += "0";
					break;
				case "1":
					result += "1";
					break;
				case "B":
					if(result.length() != 0) {
						result = result.substring(0, result.length()-1);
					}
			}
		}
		System.out.println(result);

	}

}
