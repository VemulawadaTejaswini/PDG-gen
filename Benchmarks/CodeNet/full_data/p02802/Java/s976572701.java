import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int problemCount = sc.nextInt();
		int teisyutuCount = sc.nextInt();

		int seitoCount = 0;
		int penaltyCount = 0;
		List<String> seitoList = new ArrayList<String>();

		for(int i =0; i < teisyutuCount; i++) {
			String problemNo = sc.next();
			String result = sc.next();
			if(result.equals("AC")) {
				if(seitoList.indexOf(problemNo) == -1) {
					seitoCount++;
					seitoList.add(problemNo);
				}
			}else {
				if(seitoList.indexOf(problemNo) == -1) {
					penaltyCount++;
				}
			}
		}
		System.out.println(seitoCount + " " + penaltyCount);
	}
}
