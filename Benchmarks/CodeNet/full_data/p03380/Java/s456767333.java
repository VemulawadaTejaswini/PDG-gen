import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] numbers = new long[n];
        long max = -1;
        for (int i = 0; i < n; i++) {
            long num = sc.nextLong();
            numbers[i] = num;
            max = Math.max(max, num);
        }
        
        Arrays.sort(numbers);
        max = numbers[n - 1];
        long want = max / 2;
        long r = -1;
        int k = n / 2;
        while (true) {
            if (numbers[k] == want) {
                r = want;
                break;
            }
            if (numbers[k] < want) {
                if (numbers[k + 1] == want) {
                    r = want;
                    break;
                }
                if (numbers[k + 1] < want) {
                    k++;
                    continue;
                } else {
                    if (numbers[k + 1] - want > want - numbers[k]) {
                        r = numbers[k];
                    } else {
                        r = numbers[k + 1];
                    }
                    break;
                }
            } else {
                if (numbers[k - 1] == want) {
                    r = want;
                    break;
                }
                if (numbers[k - 1] > want) {
                    k--;
                    continue;
                } else {
                    if (numbers[k] - want <= want - numbers[k - 1]) {
                        r = numbers[k];
                    } else {
                        r = numbers[k - 1];
                    }
                    break;
                }
            }
        }
        
        System.out.println(max + " " + r);
    }
    
    public static long comb(long n, long k) {
        if (k > n / 2) {
            k = n - k;
        }
        long a = 1;
        for (long i = n; i > n - k; i--) {
            a *= i;
            System.out.println(a);
        }
        
        long b = 1;
        for (long i = k; i >= 1; i--) {
            b *= i;
        }
        
        return a / b;
    }
}