import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int totalScore = 0;
		List<Integer> jogaiKohoList= new ArrayList<Integer>();
		for(int i =0;i < n;i++) {
			int score = sc.nextInt();
			totalScore += score;
			if(score % 10 !=0) {
				jogaiKohoList.add(score);
			}
		}
		Collections.sort(jogaiKohoList);
		if(totalScore %10 !=0) {
			System.out.println(totalScore);
		}else {
			if(jogaiKohoList.isEmpty()) {
				System.out.println(0);
			}else {
				totalScore -= jogaiKohoList.get(0);
				System.out.println(totalScore);
			}
		}

	}

}