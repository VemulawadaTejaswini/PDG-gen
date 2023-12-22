import java.util.ArrayList;
import java.util.Scanner;

class Result {
	public int probNum;
	public String result;

	public Result(int probNum, String result) {
		this.probNum = probNum;
		this.result = result;
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		ArrayList<Result> results = new ArrayList<Result>();
		boolean hasCollect = false;
		for(int i=0; i<m; ++i)  {
			Result result = new Result(scan.nextInt(), scan.next());
			if(result.result.equals("AC")) {
				hasCollect = true;
			}
			results.add(result);
		}
		scan.close();

		int collectNum = 0;
		int penaNum = 0;

		if(hasCollect == true) {
			ArrayList<Integer> collected = new ArrayList<Integer>();
			for(Result result: results) {
				boolean isSet = collected.contains(result.probNum);
				if(result.result.equals("AC") && !isSet) {
					collected.add(result.probNum);
					collectNum ++;
				}
				if(collected.size() == n) {
					break;
				}
			}

			ArrayList<Integer> alreadyCollected = new ArrayList<Integer>();
			for(Result result: results) {
				boolean isSet = collected.contains(result.probNum);
				if(result.result.equals("WA") && isSet && !alreadyCollected.contains(result.probNum)) {
					penaNum++;
				} else if (result.result.equals("AC") && !alreadyCollected.contains(result.probNum)) {
					alreadyCollected.add(result.probNum);
				}
				if(alreadyCollected.size() == n) {
					break;
				}
			}
		}

		System.out.println(collectNum + " " + penaNum);

	}

}