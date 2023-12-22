import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        HashMap<Integer,ArrayList<Work>> arr = new HashMap<Integer,ArrayList<Work>>();
        // ArrayList<Work> list = new ArrayList<Work>();
        for (int i = 0; i < N; i++) {
            int d = sc.nextInt();
            int v = sc.nextInt();
            // list.add(new Work(d, v));
            if (arr.get(d) == null) {
                arr.put(d, new ArrayList<Work>());
            }
            arr.get(d).add(new Work(d, v));
        }

        // for (int i = 0; i <= 100000; i++) {
        //     if (arr.get(i) == null)
        //         continue;
        //     Collections.sort(arr.get(i));
        // }
        // Collections.sort(list);

        long ans = 0;
        int limit = M;
        // System.out.println();
        ArrayList<Work> list = new ArrayList<Work>();
        for (int i = 1; i <= M; i++) {
            if (arr.get(i) != null) {
                ArrayList<Work> sub = arr.get(i);
                for(Work work:sub){
                    int ind = binary_search(work.v+1, list);
                    list.add(Math.min(Math.max(0,ind),list.size()),work);
                }
            }
            // System.out.println(Arrays.toString(list.toArray()));
            // list.add(index, element);
            // Collections.sort(list);
            if(!list.isEmpty()){
                ans+=list.get(list.size()-1).v;
                list.remove(list.size()-1);
            }
        }
        System.out.println(ans);
    }

    	// index が条件を満たすかどうか
	static boolean isOK(int index, int key, ArrayList<Work> list) {
		if (list.get(index).v >= key)
			return true;
		else
			return false;
	}

	// 汎用的な二分探索のテンプレ
	static int binary_search(int key, ArrayList<Work> list) {
		int left = -1; // 「index = 0」が条件を満たすこともあるので、初期値は -1
		int right = (int) list.size(); // 「index = a.size()-1」が条件を満たさないこともあるので、初期値は a.size()
		/* どんな二分探索でもここの書き方を変えずにできる！ */
		while (right - left > 1) {
			int mid = left + (right - left) / 2;
			if (isOK(mid, key, list))
				right = mid;
			else
				left = mid;
		}
		/* left は条件を満たさない最大の値、right は条件を満たす最小の値になっている */
		return right;
	}
}

class Work implements Comparable {
    int d;
    int v;

    Work(int d, int v) {
        this.d = d;
        this.v = v;
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Work))
            return 0;
        Work one = this;
        Work two = (Work) o;
        return two.v - one.v;
        // if (one.d == two.d) {
        // // if (one.v != two.v) {
        // return one.v - two.v;
        // // return two.v - one.v;
        // } else {
        // // return two.d - one.d;
        // return two.v - one.v;
        // }
    }

    @Override
    public String toString() {
        return d + " " + v;
    }
}