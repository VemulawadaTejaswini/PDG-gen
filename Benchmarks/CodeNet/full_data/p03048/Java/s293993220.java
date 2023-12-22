
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Input
		Scanner sc = new Scanner(System.in);
		int R = Integer.parseInt(sc.next());
		int G = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int N = Integer.parseInt(sc.next());
		sc.close();

		//Logic
		ArrayList<Integer> list = new ArrayList<>();
		list.add(R);
		list.add(G);
		list.add(B);
		Collections.sort(list,Collections.reverseOrder());

		R = list.get(0);
		G = list.get(1);
		B = list.get(2);

		int answer = 0;

		if(R > N) {
			answer = 0;
		}
		else {
		for (int r = 0 ; r <= N/R ; r++) {
			if(r * R > N) {
				break;
			}
			else
			{
				for (int g = 0 ; g <= N/G ; g++) {
					if(r * R + g * G > N) {
						continue;
					}
					else
					{
						for (int b = 0 ; b <= N/B ; b++) {
							if(r * R + g * G + b * B > N) {
								continue;
							}
							if(r * R + g * G + b * B == N) {
								answer++;
							}
						}
					}
				}
			}
		}
		}

		//Output
		System.out.println(answer);
	}
}
