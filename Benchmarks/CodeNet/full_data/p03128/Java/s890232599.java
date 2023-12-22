import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	int N, M;
	
	public int[] numToM = {-1,2,5,5,4,5,6,3,7,6};
	public int[] mToNum = {-1,-1,-1,-1,-1,-1,-1,-1};
	
	List<Integer> mList = new ArrayList<Integer>();
	
	public void read() {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		M = in.nextInt();
		
		for (int i=0; i<M; i++) {
			int num = in.nextInt();
			if (mToNum[numToM[num]] == -1) {
				mToNum[numToM[num]] = num;
			} else if (mToNum[numToM[num]] < num) {
				mToNum[numToM[num]] = num;
			}
		}
		in.close();
	}
	
	public void prepare() {
		for (int i=1; i<=7; i++) {
			if (mToNum[i] != -1) {
				mList.add(i);
			}
		}
		mList.sort(null);
	}
	
	public String solve() {
		List<String> result = sub(N, 0);
		result.sort(null);
		Collections.reverse(result);
		
		return String.join("", result);
	}
	
	private List<String> sub(int left, int next) {
		int m = 0;
		try {
			m = mList.get(next);
		} catch (IndexOutOfBoundsException e) {
			return null;
		}
		int num = mToNum[m];
		
		int start = left / m;
		for (int i=start; i>=0; i--) {
			int nextLeft = left - (m*i);
			if (nextLeft == 0) {
				return Collections.nCopies(i, Integer.toString(num));
			} else {
				List<String> subStr = sub(nextLeft, next+1);
				if (subStr != null) {
					List<String> thisStr = new LinkedList<String>();
					thisStr.addAll(Collections.nCopies(i, Integer.toString(num)));
					thisStr.addAll(subStr);
					return thisStr;
				}
			}
		}

		return null;
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.read();
		main.prepare();
		System.out.println(main.solve());
	}
}