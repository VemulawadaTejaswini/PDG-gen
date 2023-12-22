import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> nList = new ArrayList<Integer>();
		for (int i=0; i<N; i++) {
			nList.add(sc.nextInt());
		}

		int processingCount = divisionAllEven(nList, 0);

		System.out.println(processingCount);

	}
	private static int divisionAllEven(List<Integer> nList, int processingCount) {

		for (int i=0; i<nList.size(); i++) {
			Integer Ai = nList.get(i);
			if (Ai%2 == 0) {
				nList.set(i, (Ai/2));
			}
			else {
				return processingCount;
			}
		}
		processingCount++;
		return divisionAllEven(nList, processingCount);
	}

}