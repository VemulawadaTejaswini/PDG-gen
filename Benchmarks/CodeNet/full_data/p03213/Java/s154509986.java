import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
		TaskD solver = new TaskD();
		solver.solve(1, in, out);
		out.close();
	}
static class TaskD   {
public   static int[] isnotprime;
public   static int[] facminp;

public void solve(int testNumber, Scanner in, PrintWriter out) {
        int N = in.nextInt();
        int[] qnum = new int[100];
        sieve(N);
        for(int i = 2; i<=N; i++){
            ArrayList<Integer> qlist = factor(i);
            for(int q : qlist){
                qnum[q]++;
            }
        }
        Arrays.sort(qnum);
        int count2 = 0;
        int count24 = 0;
        int count4 = 0;
        int count14 = 0;
        int count74 = 0;
        int i = 99;
        while (qnum[i] >= 74){
            count74++;
            count24++;
            count14++;
            count4++;
            count2++;
            i--;
        }
        while (qnum[i] >= 24){
            count24++;
            count14++;
            count4++;
            count2++;
            i--;
        }
        while (qnum[i] >= 14){
            count14++;
            count4++;
            count2++;
            i--;
        }
        while (qnum[i] >= 4){
            count4++;
            count2++;
            i--;
        }
        while (qnum[i] >= 2){
            count2++;
            i--;
        }
        out.println(count74 + count24*(count2-1) + count14*(count4-1) + count4*(count4-1)*(count2-2)/2);
    }

public   static int[] sieve(int n) {
        int MAX_BLOCKNUM = (n+1)/32/2+1;
        int[] removed_prime = new int[MAX_BLOCKNUM];
        isnotprime = new int[MAX_BLOCKNUM];
     facminp = new int[(n-3)/2 + 1];

        int[] magic = {0, 1, 23, 2, 29, 24, 19, 3, 30, 27, 25, 11, 20, 8, 4, 13, 31, 22, 28, 18, 26, 10, 7, 12, 21, 17, 9, 6, 16, 5, 15, 14};
        int MAX_IDX = (n-3)/2;

        loop:for(int i = 0; i < MAX_BLOCKNUM; i++){
            while(~(removed_prime[i] | isnotprime[i]) != 0){
                int not_removed = ~(removed_prime[i] | isnotprime[i]);
                int min_not_removed = not_removed & -not_removed;
                int idx = i<<5 | magic[min_not_removed * 0x076be629>>>27]; // i*32 + n（magic[2^n * 0x076be629 >>> 27] = n）
                int p = 2*idx+3;

                if(p > Math.sqrt(n)) break loop;
                removed_prime[i] |= min_not_removed;

                for(int idx_kp = 2*idx*idx+6*idx+3; idx_kp <= MAX_IDX; idx_kp += p) {
                    isnotprime[idx_kp >> 5] |= 1 << (idx_kp & 31);
                if(facminp[idx_kp] == 0) facminp[idx_kp] = p;
                }
            }
        }
//    return;

        int[] ret = new int[(int)(1.1*(n+64)/Math.log(n+64))];
        ret[0] = 2;
        int pos = 1;
        for(int i = 0; i < MAX_BLOCKNUM; i++){
            int prime_bit = ~isnotprime[i];
            while (prime_bit != 0){
                int min_prime_bit = prime_bit & -prime_bit;
                int idx = i<<5 | magic[min_prime_bit * 0x076be629>>>27];
                int p = 2*idx+3;
                if(p > n) break;
                ret[pos++] = p;
                facminp[(p-3)/2] = p;
                prime_bit &= (prime_bit-1);
            }
        }
        return Arrays.copyOf(ret, pos);
    }

public   static ArrayList<Integer> factor(int n) {
        ArrayList<Integer> ret = new ArrayList<>();
        while(n > 1){
            if((n & 1) == 0){
                ret.add(2);
                n /= 2;
            } else {
                ret.add(facminp[(n-3)/2]);
                n /= facminp[(n-3)/2];
            }
        }
        return ret;
    }

}
}

