import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String line1;
		List<String> restLine = new ArrayList<String>();

		Scanner sc = new Scanner(System.in);
		line1 = sc.nextLine();
		while(true) {
			String tmp = sc.nextLine();
			if(tmp.length() == 0 || !sc.hasNextLine()) {
				break;
			}
			restLine.add(tmp);
			}
		String[] splitedLine1 = line1.split(" ");
		Integer testNum = Integer.parseInt(splitedLine1[0]);
		Integer teishutuNum = Integer.parseInt(splitedLine1[1]);

		List<Result> resultList = new ArrayList<>();
		for(String resultStr : restLine) {
			resultList.add(new Result(resultStr));
		}

		int[] ac = new int[testNum];
		int[] wa = new int [testNum];

		for(Result resultModel : resultList) {
			if(ac[resultModel.i - 1] == 0) {
				if(resultModel.result.equals("AC")) {
					ac[resultModel.i - 1] ++;
				}
				if(resultModel.result.equals("WA")) {
					wa[resultModel.i - 1] ++;
				}
			}
		}
		int acTotal = 0;
		int waTotal = 0;

		for(int i=0; i < testNum; i++) {
			acTotal += ac[i];
			waTotal += wa[i];
		}

		System.out.println(acTotal + " " + waTotal);

	}
}

class Result {
	Integer  i;
	String result;

	public Result(String resultStr) {
		String[] splitedResultStr = resultStr.split(" ");
		i = Integer.parseInt(splitedResultStr[0]);
		result = splitedResultStr[1];
	}
}
