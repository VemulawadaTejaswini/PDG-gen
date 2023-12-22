import java.util.Arrays;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(), K = in.nextInt();
        int[] X = new int[N];
        for (int i = 0; i < N; i++) {
            X[i] = in.nextInt();
        }
        Arrays.sort(X);
        int neg = 0, zero = 0;
        for (int x : X) {
            if (x < 0) neg++;
            else if (x == 0) zero++;
            else break;
        }
        int pos = X.length - neg - zero;
        int posStart = neg + zero;
        int negSum = neg * pos, zeroSum = (X.length * 2 - 1 - zero) * zero / 2;
        if (negSum > K) {
            long max = 0, min = (long) X[X.length-1]*X[0];
            while (true) {
                long mid = (max - min) / 2 + min;
                long res = Integer.MIN_VALUE;
                int k = 0;
                for (int i = neg - 1, j = X.length - 1; i >= 0; i--) {
                    while ((long) X[i] * X[j] < mid && j > posStart) {
                        j--;
                    }
                    k += j - posStart + 1;
                    res = Math.max(res, (long) X[i] * X[j]);
                }
                if (k == K) {
                    System.out.println(res);
                    break;
                } else if (k > K) {
                    max = mid;
                } else {
                    min = mid + 1;
                }
            }
        } else if (negSum + zeroSum >= K) {
                System.out.println(0);
        } else {
            K -= negSum + zeroSum;
            long min = 0, max = Math.max((long) X[X.length-1]*X[X.length-2], (long) X[0]*X[1]);
            while (true) {
                long mid = (max - min) / 2 + min;
                long res = 0;
                int k = 0;
                if (neg > 1) {
                    for (int i = 0, j = neg - 1; i < j; j--) {
                        while ((long) X[i] * X[j] > mid && j > i) {
                            i++;
                        }
                        if (j == i) break;
                        k += j - i ;
                        res = Math.max(res, (long) X[i] * X[j]);
                    }    
                }
                
                if (pos > 1) {
                    for (int i = posStart, j = X.length - 1; i < j; i++) {
                        while ((long) X[i] * X[j] > mid && j > i) {
                            j--;
                        }
                        if (j == i) break;
                        k += j - i;
                        res = Math.max(res, (long) X[i] * X[j]);
                    }    
                }
                
                if (k == K) {
                    System.out.println(res);
                    break;
                } else if (k > K) {
                    max = mid;
                } else {
                    min = mid + 1;
                }
            }
        }
    }
}