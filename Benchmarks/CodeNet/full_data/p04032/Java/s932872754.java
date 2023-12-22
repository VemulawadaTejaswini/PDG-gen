import java.util.*;
public class Main {
	
	
	public static void main(String[] args) {
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		
		int len = in.length();
		int kahansu = in.length() /2;
		char[] inArray = in.toCharArray();
		int [] counter = new int[alpha.length()];
		boolean isUnblance = false;
		for (int i = 0; i < inArray.length;i++) {
			String moji = Character.toString(inArray[i]);

			int j = alpha.indexOf(moji);
			counter[j]++;
		}
		int index = 0;
		int max = 0;
		String unblanceMoji = "";
		for (int i = 0;i < counter.length; i++ ) {
			if (counter[i] >= kahansu) {
				if (counter[i] > max) {
					unblanceMoji = alpha.substring(i, i + 1);
					isUnblance = true;
					max = counter[i];
					index = i;
				}

			}
		}
		if (isUnblance) {
			System.out.println((in.indexOf(unblanceMoji) + 1) + " " + (in.lastIndexOf(unblanceMoji) + 1) );
		} else {
			System.out.println("-1 -1");
		}

	}
}