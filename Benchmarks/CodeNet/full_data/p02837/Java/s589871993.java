import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	static ArrayList<Integer[]> ptList = new ArrayList<>();
	static ArrayList<Integer[][]> list = new ArrayList<>();
	static int n;
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		createPList(n);

		int len = ptList.size();
		int a,i,j,k;

		for(i = 0; i < n; i++) {
			a = scan.nextInt();
			Integer[][] temp = new Integer[a][2];
			for(j = 0; j < a; j++) {
				temp[j][0] = scan.nextInt() - 1;
				temp[j][1] = scan.nextInt();
			}
			list.add(temp);
		}

		boolean f;
		int cnt;
		int max = Integer.MIN_VALUE;
		for(i = 0; i < len; i++) {
			f = true;
			cnt = 0;
			for(j = 0; j < n; j++) {
				if(!judge(ptList.get(i), list.get(j), j)) {
					f = false;
					break;
				}
			}
			if(f) {
				for(k = 0; k < n; k++) {
					if(ptList.get(i)[k] == 1)
						cnt++;
				}
			}else {
				cnt = 0;
			}
			if(cnt > max)
				max = cnt;
		}
		System.out.println(max);
	}
	public static void createPList(int n) {
		int pt = (int)Math.pow(2, n) - 1;

		int i,j;
		Integer[] temp;
		for(i = 0; i <= pt; i++) {
			temp = new Integer[n];
			for(j = 0; j < n; j++) {
				temp[j] = (1 & i >> j);
			}
			ptList.add(temp);
		}
	}
	public static boolean judge(Integer[] ptList, Integer[][] list, int index) {
		int i;
		boolean result = true;
		for(i = 0; i < list.length; i++) {
			int p = list[i][0];
			int v = list[i][1];
			if(ptList[index] != 1) {
				continue;
			}
			result = ptList[p] == v;
			if(!result)
				break;
		}
		return result;
	}
}