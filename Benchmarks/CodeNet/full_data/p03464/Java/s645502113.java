import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int K = sc.nextInt();
	int[] a = new int[K];
	for (int i = 0; i < K; i++) {
	    a[i] = sc.nextInt();
	}
	ArrayList<Integer> targetsNums = new ArrayList<Integer>();
	targetsNums.add(2);
	for (int i = K - 1; i >= 0; i--) {
	    int tmp_a = a[i];
	    ArrayList<Integer> targets = new ArrayList<Integer>();
	    for (Integer j : targetsNums) {
		if (j % tmp_a == 0) {
		    targets.add(j);
		}
	    }
	    ArrayList<Integer> nextTargetsNums = new ArrayList<Integer>();
	    for (Integer k : targets) {
		for (int l = 0; l < a[i]; l++) {
		    nextTargetsNums.add(k + l);
		}
	    }
	    targetsNums = nextTargetsNums;
	}

	System.out.println(targetsNums.get(0) + " " + targetsNums.get(targetsNums.size() - 1));
    }

}
