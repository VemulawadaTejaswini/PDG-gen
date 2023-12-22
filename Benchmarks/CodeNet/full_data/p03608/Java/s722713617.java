import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int R = sc.nextInt();
        int[] r = new int[R];
        for(int i = 0; i < R; i++) {
            r[i] = sc.nextInt();
        }
        //initialize dp table
        int[][] dp = new int[N+1][N+1];
        for(int i = 0; i < N+1; i++) {
            for(int j = 0; j < N+1; j++) {
                if (i==j) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        //use link to set dp table
        for(int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            dp[a][b] = c;
            dp[b][a] = c;
        }
        //Floyd-Warshall Algorithm
        for(int k = 1; k < N+1; k++) {
            for(int i = 1; i < N+1; i++) {
                for(int j = 1; j < N+1; j++) {
                    dp[i][j] = Math.min(dp[i][j],dp[i][k] + dp[k][j]);
                }
            }
        }
        //print dp table
        // for(int i = 1; i<N+1; i++) {
        //     for(int j=1; j<N+1; j++) {
        //         System.out.print(dp[i][j]);
        //         System.out.print(" ");
        //     }
        //     System.out.println();
        // }
        //calculate answer
        int answer = Integer.MAX_VALUE;
        Arrays.sort(r); // initial permutation
        Iterator it = new PermutationIterator(r);
        answer = Math.min(answer,solveForPerm(r,dp));
        while(it.hasNext()) {
            r = (int[]) it.next();
            answer = Math.min(answer,solveForPerm(r,dp));
        }
        System.out.println(answer);
    }
    
    private static int solveForPerm(int[] perm,int[][] dp) {
        int candidate = 0;
        for(int i = 0; i < perm.length - 1; i++) {
            int from = perm[i];
            int to = perm[i+1];
            candidate += dp[from][to];
        }
        return candidate;
    }
    private static void print(int[] array) {
        for(int i = 0; i<array.length; i++) {
            System.out.print(array[i]);
            System.out.print(" ");
        }
        System.out.println("");
    }

    public static class PermutationIterator implements Iterator {
        private int[] current;
        // private boolean hasNext_;
        private int length;
        private int lastAscIndex;

        public PermutationIterator(int[] array) {
            current = array;
            length = array.length;
            // hasNext_ = false;
            lastAscIndex = -1;
            for (int i = 0; i < length - 1; i++) {
                if (current[i] < current[i + 1]) {
                    lastAscIndex = i;
                    // hasNext_ = true;
                }
            }
        }

        public boolean hasNext() {
            // return hasNext_;
            return (lastAscIndex != -1);
        }

        public int[] next() {
            if (lastAscIndex == -1) {
                Arrays.sort(current);
                return current;
            }
            int reverseLength = length - lastAscIndex - 1;
            // reversal
            int[] tmpArray = new int[reverseLength];
            // mem original values
            for (int i = 0; i < reverseLength; i++) {
                int index = lastAscIndex + 1 + i;
                tmpArray[i] = current[index];
            }
            // reversal
            for (int i = 0; i < reverseLength; i++) {
                int index = length - 1 - i;
                current[index] = tmpArray[i];
            }
            // swap lastAscIndex and least value larger than current[lastAscIndex]
            int swapIndex = -1;
            int minValue = Integer.MAX_VALUE;
            for (int i = lastAscIndex + 1; i < length; i++) {
                if (current[i] > current[lastAscIndex]) {
                    if (current[i] < minValue) {
                        minValue = current[i];
                        swapIndex = i;
                    }
                }
            }
            // swap!
            int tmp = current[lastAscIndex];
            current[lastAscIndex] = current[swapIndex];
            current[swapIndex] = tmp;

            // hasNext_ judge
            lastAscIndex = -1;
            for (int i = 0; i < length - 1; i++) {
                if (current[i] < current[i + 1]) {
                    lastAscIndex = i;
                }
            }

            return current;
        }
    }
}