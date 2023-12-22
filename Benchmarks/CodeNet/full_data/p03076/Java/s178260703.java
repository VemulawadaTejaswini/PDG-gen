import java.lang.reflect.Array;
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int E = sc.nextInt();

		List<Integer> timeList = Arrays.asList(A, B, C, D, E);

		int aGap = Math.abs(10-A%10) == 10 ? 0 : Math.abs(10-A%10);
		int bGap = Math.abs(10-B%10) == 10 ? 0 : Math.abs(10-B%10);
		int cGap = Math.abs(10-C%10) == 10 ? 0 : Math.abs(10-C%10);
		int dGap = Math.abs(10-D%10) == 10 ? 0 : Math.abs(10-D%10);
		int eGap = Math.abs(10-E%10) == 10 ? 0 : Math.abs(10-E%10);

		List<Integer> gapList = new ArrayList<>();
		gapList.add(aGap);
		gapList.add(bGap);
		gapList.add(cGap);
		gapList.add(dGap);
		gapList.add(eGap);

		Integer maxGap = gapList.stream()
                .max((a, b) -> a.compareTo(b)).get();

		int maxIndx = gapList.indexOf(maxGap);

		List<Integer> waitList = new ArrayList<>();
		waitList.add(A + aGap);
		waitList.add(B + bGap);
		waitList.add(C + cGap);
		waitList.add(D + dGap);
		waitList.add(E + eGap);

		waitList.remove(maxIndx);

		int sum = 0;

		for(int t : waitList){
			sum += t;
		}

		System.out.println(sum+timeList.get(maxIndx));

	}

}
