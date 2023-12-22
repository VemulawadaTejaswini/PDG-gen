import java.util.*;

// ABC 54-D
// https://beta.atcoder.jp/contests/abc054/tasks/abc054_d

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int H = in.nextInt();
		
		long[] swingD = new long[N];
		long[] throwD = new long[N];
		long maxSwingD = 0;
		int maxSwingDIndex = 0;
		
		for (int i = 0; i < N; i++) {
			long sd = in.nextLong();
			long td = in.nextLong();
			
			if (maxSwingD < sd) {
				maxSwingD = sd;
				maxSwingDIndex = i;
			}
			
			swingD[i] = sd;
			throwD[i] = td;
		}

		ArrayList<Long> nums = new ArrayList<Long>();
		for (int i = 0; i < N; i++) {
			if (maxSwingDIndex != i && maxSwingD < throwD[i]) {
				nums.add(throwD[i]);
			}
		}
		nums.sort(null);
		
		long answer = 0;
		for (int i = nums.size() - 1; i >= 0; i--) {
			H -= nums.get(i);
			answer++;
			if (H <= 0) {
				break;
			}
		}
		
		if (H <= 0) {
			System.out.println(answer);
			return;
		} else if (H <= throwD[maxSwingDIndex]) {
			System.out.println(answer + 1);
			return;
		}
		
		H -= throwD[maxSwingDIndex];
		answer++;
		answer += H / maxSwingD;
		if (H % maxSwingD != 0) {
			answer++;
		}
		System.out.println(answer);
		
	}
}

/*
		Sword[] swords = new Sword[N];
		HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
		ArrayList<Integer> sortSwingD = new ArrayList<Integer>();
		
		for (int i = 0; i < N; i++) {
			int swingD = in.nextInt();
			int throwD = in.nextInt();
			
			if (count.containsKey(swingD)) {
				count.put(swingD, count.get(swingD) + 1);
			} else {
				count.put(swingD, 1);
				sortSwingD.add(swingD);
			}
			swords[i] = new Sword(swingD, throwD);
		}
		
		sortSwingD.sort(null);
		
		int maxSwingD = sortSwingD.get(sortSwingD.size() - 1);
		int answer = H / maxSwingD;
		if (H % maxSwingD != 0) {
			answer++;
		}
		
		// Simulate that throw the sword i and swing the rest of times
		
		System.out.println(answer);

class Sword implements Comparable<Sword> {

	int swingD;
	int throwD;
	
	public Sword(int swingD, int throwD) {
		this.swingD = swingD;
		this.throwD = throwD;
	}
	
	@Override
	public int compareTo(Sword o) {
		if (this.throwD == o.throwD) {
			// If throw damage is the same, keep the sword that has higher swingD
			return o.swingD - this.swingD;
		} else {
			return this.throwD - o.throwD;
		}
	}
	
}
*/