import java.util.Arrays;
import java.util.Scanner;

import java.util.List;

public class Main {

	public static void main(String[] args) {

		String line = null;
		try (Scanner sc = new Scanner(System.in)) {
			line = sc.nextLine();

			String[] tmpArray = line.split(" ");
			int price = Integer.parseInt(tmpArray[0]);
			int errNum = Integer.parseInt(tmpArray[1]);
			line = sc.nextLine();
			List<String> errNumVal = Arrays.asList(line.split(" "));
			String tmpStr = "";
			int result = 0;
			for (int i = price; i <= 99999; i++) {
				tmpStr = Integer.toString(i);
				boolean flg = true;
				for (String tmps : errNumVal) {
					if (tmpStr.indexOf(tmps) >= 0) {
						flg = false;
						//break;
					}
				}
				if (flg){
					result = i;
					break;
				}
			}

			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}