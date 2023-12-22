import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main (String[] args) {

		Scanner sc = new Scanner (System.in);

		int N = sc.nextInt();

		int[] scoreList = new int[N];
		String[] cityList = new String[101];
		String[] city = new String[N];

		for (int index=0; index<N; index++) {
			String name = sc.next();
			int score = sc.nextInt();

			scoreList[index]=score;
			cityList[score]=name;
			city[index]=name;
		}

		Arrays.sort(city);

		for (int index=0; index<N; index++) {

			int temp = find(city[index],cityList,N);
			System.out.println(get(scoreList,temp,N)+1);
		}
	}

	private static int get (int[] scoreList, int temp, int N) {
		int a = 0;
		for (int index=0; index<N; index++) {
			if (scoreList[index]==temp) {
				a = index;
				break;
			}
		}
		return a;
	}
	private static int find (String city, String[] cityList,int N) {

		int max=0;
		for (int index=0; index<101; index++) {

			try {
				if (cityList[index].equals(city)) {
					if (index>max) {
						max=index;
					}
				}
			} catch (Exception e) {

			}
		}
		cityList[max]=null;
		return max;
	}
}