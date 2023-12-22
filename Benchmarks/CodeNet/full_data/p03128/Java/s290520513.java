import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.TreeMap;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Collections;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
*/public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		Scanner in = new Scanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskD solver = new TaskD();
		solver.solve(1, in, out);
		out.close();
	}
static class TaskD   {
public void solve(int testNumber, Scanner in, PrintWriter out) {
        HashMap<Integer, Integer> match = new HashMap<>();
        TreeMap<Integer, Integer> num = new TreeMap<>();
        match.put(1, 2);
        match.put(2, 5);
        match.put(3, 5);
        match.put(4, 4);
        match.put(5, 5);
        match.put(6, 6);
        match.put(7, 3);
        match.put(8, 7);
        match.put(9, 6);
        int N = in.nextInt();
        int M = in.nextInt();
        for (int i=0; i<M; i++) {
            int a = in.nextInt();
            if(num.containsKey(match.get(a))){
                if(a < num.get(match.get(a))){
                    continue;
                }
            }
            num.put(match.get(a), a);
        }

        int N2 = num.size();
        int[][] u = new int[N2][2];
        int rc1 = 0;
        for (int key: num.keySet()) {
            u[rc1][0] = key;
            rc1++;
        }

        u[0][1] = N / num.firstKey();
        int h = N % num.firstKey();

        int ans = -100;
        int k = 0;
        loop:while(true){
            u[0][1]--;
            h += num.firstKey();
            k = 1;
            while(true){
                boolean con = false;
                for (int s = 0; s < Math.pow(num.size()-1, k); s++) {
                    int sc = s;
                    int zantei = 0;

                    int sum = 0;
                    int maxnum = 0;
                    for (int i = 0; i < k; i++) {
                        sum += u[sc % (num.size()-1) + 1][0];
                        sc /= (num.size()-1);
                        maxnum = Math.max(maxnum, num.get(u[sc % (num.size()-1) + 1][0]));
                    }
                    if (sum == h && zantei < maxnum) {
                        ans = s;
                        zantei = maxnum;
                    }
                    if(sum < h){
                        con = true;
                    }
                }
                if(ans != -100){
                    for (int i = 0; i < k; i++) {
                        u[ans % (num.size()-1) + 1][1]++;
                        ans /= (num.size()-1);
                    }
                    break loop;
                }
                if(!con){
                    break;
                }
                k++;
            }
        }

        TreeMap<Integer, Integer> num2 = new TreeMap<>(Collections.reverseOrder());
        for (int i=0; i<N2; i++) {
            num2.put(num.get(u[i][0]), u[i][1]);
        }
        for (int key : num2.keySet()) {
            for(int i=0; i<num2.get(key); i++){
                out.print(key);
            }
        }
    }

}
}

