import java.util.*;
/**
 * AtCoder Beginner Contest 047
 * 
 * 
 * @author stmasa2016
 *
 */
public class Main {
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		int cnt = 0;
		if ((in.indexOf("W") >= 0) && (in.indexOf("B") >= 0)){
			cnt = reversi(in);
		}
		System.out.println(cnt);
		sc.close();

	}
	
	private static int reversi(String in) {
		int cnt = 0;
		String stone = getStone(in);
		String target = getTarget(in);
		String lastTarget = getTarget(in);
		String result = in;
		while (true){
			result = change(result,stone,target);

			cnt++;
			if (result.indexOf(lastTarget) < 0) {
				break;
			}
			stone = target;
			target = getTarget(result);

		}
		
		return cnt;
	}
	
	private static String getStone (String in) {
		String lastStone = in.substring(in.length() - 1);
		if (lastStone.equals("B")) {
			return "W";
		} else {
			return "B";
		}
	}
	private static String getTarget(String in) {
		String lastStone = in.substring(in.length() -1);
		return lastStone;
	}
	private static String change(String in, String stone,String target){

		char[] array = in.toCharArray();
		String[] strArray = new String[array.length];
		boolean isChange = true;
		for (int i = array.length -1; i > 0; i--) {
			if (Character.toString(array[i]).equals(stone)){
				isChange = false;
			}
			if (isChange && (Character.toString(array[i]).equals(target))) {
				strArray[i] = stone;
			} else {
				strArray[i] = Character.toString(array[i]);
			}

		}
		StringBuffer buf = new StringBuffer();
		for (int i = 0; i < strArray.length; i++) {
			buf.append(strArray[i]);
		}
		buf.append(stone);
		return buf.toString();
	}
	
}