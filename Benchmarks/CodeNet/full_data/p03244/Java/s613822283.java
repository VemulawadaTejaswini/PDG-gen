import java.util.*;
import java.util.stream.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        // programming
        int n = Util.getInputInteger(sc);
        Set<Integer> evens = new HashSet<Integer>();
        Set<Integer> odds = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            if (i%2 == 0) {
                evens.add(Util.getInputInteger(sc));
            } else {
                odds.add(Util.getInputInteger(sc));
            }
        }

		Util.output(String.valueOf(evens.size() + odds.size()));
	}
}

// =========common=========
class Util {
	public static String getInputString(Scanner sc) {
		return sc.next();
	}

	public static int getInputInteger(Scanner sc) {
		return Integer.parseInt(sc.next());
	}

	public static void output(String... params) {
		boolean isInit = true;
		String str = "";
		for (String s : params) {
			if (!isInit) {
				str += " ";
			}
			str += s;
			isInit = false;
		}
		System.out.println(str);
	}

    public static int[] toIntegerList(String... ss) {
        return Stream.of(ss).mapToInt(Integer::parseInt).toArray();
    }

    public static String[] toList(String s) {
        String[] ret = s.split("");
        return ret;
    }

    public static int sum(int... vals) {
        int sum = 0;
        for (int val : vals) {
            sum += val;
        }
        return sum;
    }

    public static int[] sort(int[] vals, boolean isAsc) {
        Arrays.sort(vals);
		if (isAsc) {
			return vals;
		}
        int[] ret = new int[vals.length];
        for (int i = 0; i < vals.length; i++) {
            ret[vals.length - i - 1] = vals[i];
        }
		return ret;
	}

    public static void gc() {
        System.gc();
    }

	public static int diff(int a, int b) {
		return Math.abs(a - b);
	}

	public static int max(int... a) {
		int temp_max = Integer.MIN_VALUE;
		for (int v : a) {
			if (v > temp_max) {
				temp_max = v;
			}
		}
		return temp_max;
	}

	public static int min(int... a) {
		int temp_min = Integer.MAX_VALUE;
		for (int v : a) {
			if (v < temp_min) {
				temp_min = v;
			}
		}
		return temp_min;
	}
}