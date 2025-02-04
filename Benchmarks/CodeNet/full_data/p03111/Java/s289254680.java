import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
*/public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		Scanner in = new Scanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskC solver = new TaskC();
		solver.solve(1, in, out);
		out.close();
	}
static class TaskC   {
public void solve(int testNumber, Scanner in, PrintWriter out) {
        int N = in.nextInt();
        int goal[] = new int[3];
        ArrayList<Integer> take = new ArrayList<>();
        for (int i=0; i<3; i++) {
            goal[i] = in.nextInt();
        }
        for (int i=0; i<N; i++) {
            take.add(in.nextInt());
        }
        out.println(newtake(take, goal));
    }

public int minmp(ArrayList<Integer> take, int[] goal) {
        int mp = 0;
        ArrayList<Integer> takec = new ArrayList<>(take);
        for (int k=0; k<3; k++) {
            int idx = 0;
            int min = 1000;
            for (int i=0; i<takec.size(); i++) {
                if(min > Math.abs(takec.get(i) - goal[k])){
                    min = Math.abs(takec.get(i) - goal[k]);
                    idx = i;
                }
            }
            mp += min;
            takec.remove(idx);
        }
        return mp;
    }

public int newtake(ArrayList<Integer> take, int[] goal) {
        int min = 1_000_000_000;
        if(take.size() == 3){
            return minmp(take, goal);
        }
        for (int i=0; i<=take.size()-2; i++) {
            for (int j=i+1; j<=take.size()-1; j++) {
                ArrayList<Integer> takec = new ArrayList<>(take);
                takec.add(takec.get(i) + takec.get(j));
                takec.remove(i);
                takec.remove(j-1);
                min = Math.min(min, newtake(takec, goal));
            }
        }
        min = Math.min(min+10, minmp(take, goal));
        return min;
    }

}
}

