import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static final int N_MAX = 100;
    static int N;
    static boolean[] isPrime = new boolean[N_MAX + 1];
    static ArrayList<Integer> idx2Prime;
    static int[][] primeFactor;

    public static void main(String[] args) {
        readInput();

        solve();
    }

    static void solve() {
        calcPrime();
        
        calcPrimeFactor();
        
        int[] primeCount = new int[idx2Prime.size()];
        
        int over75 = 0;
        int over25 = 0;
        int over15 = 0;
        int over5 = 0;
        int over3 = 0;
        
        for(int idx = 0; idx < idx2Prime.size(); idx++) {
            for(int num = 2; num <= N; num++) {
                primeCount[idx] += primeFactor[num][idx];
            }
            
            if(primeCount[idx] >= 74) {
                over75++;
            }
            if(primeCount[idx] >= 24) {
                over25++;
            }
            if(primeCount[idx] >= 14) {
                over15++;
            }
            if(primeCount[idx] >= 4) {
                over5++;
            }
            if(primeCount[idx] >= 2) {
                over3++;
            }
        }
        
        int ans = 0;
        ans += over75;
        ans += over25 *(over3 - 1);
        ans += over15 *(over5 - 1);
        ans += over5 * (over5 - 1) * (over3 - 2) / 2;
        
        System.out.println(ans);
    }


    static void readInput() {
        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
        }
    }

    static void calcPrime() {
        Arrays.fill(isPrime, true);
        
        idx2Prime = new ArrayList<>();
        
        for(int idx = 2; idx <= N_MAX; idx++) {
            if(isPrime[idx]) {
                idx2Prime.add(idx);
                for(int num = idx; num <= N_MAX; num += idx) {
                    isPrime[num] = false;
                }
            }
        }
        
    }
    
    static void calcPrimeFactor() {
        primeFactor = new int[N_MAX+1][idx2Prime.size()];
        
        for(int num = 2; num<=N_MAX; num++) {
            int tmpNum = num;
            for(int idx = 0; idx<idx2Prime.size(); idx++) {
                int prime = idx2Prime.get(idx);
                
                int count = 0;
                while((tmpNum % prime) == 0) {
                    tmpNum /= prime;
                    count++;
                }
                
                primeFactor[num][idx] = count;
                
                if(tmpNum == 1) {
                    break;
                }
            }
            
        }
    }
    
    static int combo(int idxP, int num, int[] primeCount) {
        int ans = 0;
        
        if(idxP >= primeCount.length) {
            return ans;
        }
        
        if(num < 1) {
            return 1;
        }
        
        int minI = Math.min(num, primeCount[idxP]);
        
        for(int i = 0; i<=minI; i++) {
            ans += combo(idxP + 1, num - i, primeCount);
        }
        
        return ans;
    }
    
}
