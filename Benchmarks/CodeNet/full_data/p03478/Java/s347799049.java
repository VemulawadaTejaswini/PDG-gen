import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int n = getInputInteger(sc);
		int a = getInputInteger(sc);
		int b = getInputInteger(sc);
 
        // programming
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int[] ds = toIntegerList(String.valueOf(i));
            int dsum = 0;
            for (int v : ds) {
                dsum += v;
            }
            if (a <= dsum && dsum <= b) {
                sum += i;
            }
        }
        output(String.valueOf(sum));
	}

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

    public static int[] toIntegerList(String s) {
        int[] ret = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ret[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        return ret;
    }
}