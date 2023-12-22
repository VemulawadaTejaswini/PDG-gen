import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String inputS = scanner.next();

		if(hasSameChar(inputS)) {
			System.out.println("no");
		}else {
			System.out.println("yes");
		}


		scanner.close();

	}

	public static boolean hasSameChar(String inputS) {
		List<String> dataset=new ArrayList<String>();

		for(int i=0;i<inputS.length();i++) {

			String buf=inputS.substring(i, i+1);

			if(dataset.contains(buf)) {
				return true;
			}

			dataset.add(buf);

		}

		return false;

	}



}
