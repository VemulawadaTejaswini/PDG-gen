import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sString = sc.next();

		char[] sArray = sString.toCharArray();
		int ans = 0;

		ArrayList<Character> ansArray = new ArrayList<>();

		for (int i = 0; i < sArray.length; i++) {
			if (ansArray.size() == 0){
				ansArray.add(sArray[i]);
			}else if (ansArray.get(ansArray.size()-1) != sArray[i]){
				ansArray.remove(ansArray.size()-1);
				ans += 2;
			}else {
				ansArray.add(sArray[i]);
			}
		}
		System.out.println(ans);
	}
}
