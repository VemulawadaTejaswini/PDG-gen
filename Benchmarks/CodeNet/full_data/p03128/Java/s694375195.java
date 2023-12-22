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
	
	private String create(int[] nums) {
		List<String> ret = new LinkedList<String>();
		for (int i=0; i<nums.length; i++) {
			ret.addAll(Collections.nCopies(nums[i], Integer.toString(mToNum[mList.get(i)])));
		}
		ret.sort(null);
		Collections.reverse(ret);
		return String.join("", ret);
	}
	
	public String solve() {
		int[] start = new int[mList.size()];
		Arrays.fill(start, 0);
		List<int[]> result = sub(N, 0, start, 0);
		
		List<String> ret = new LinkedList<String>();
		for (int[] ns : result) {
			ret.add(create(ns));
		}
		ret.sort(null);
		return ret.get(ret.size()-1);
	}
	
	private List<int[]> sub(int left, int next, int[] nums, int sum) {
		LinkedList<int[]> ret = new LinkedList<int[]>();
		long digit = -1;
		if (next >= mList.size()) {
			return null;
		}
		int m = mList.get(next);
		
		int start = left / m;
		for (int i=start; i>=0; i--) {
			nums[next] = i;
			int total = sum + i;
			int nextLeft = left - (m*i);
			if (nextLeft == 0) {
				if (digit == -1) {
					digit = total;
				} else if (digit > total) {
					break;
				}
				ret.add(nums.clone());
			} else {
				List<int[]> subStr = sub(nextLeft, next+1, nums, total);
				if (subStr != null && subStr.size() > 0) {
					boolean onlySmall = true;
					for (int[] ns : subStr) {
						if (digit == -1) {
							digit = sum(ns);
						} else if (digit > sum(ns)) {
							continue;
						}
						ret.add(ns);
						onlySmall = false;
					}

					if (onlySmall) {
						break;
					}
				}
			}
		}

		return ret;
	}
	
	private long sum(int[] nums) {
		long sum = 0;
		for (int i=0; i<nums.length; i++) {
			sum += nums[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.read();
		main.prepare();
		System.out.println(main.solve());
	}
}
