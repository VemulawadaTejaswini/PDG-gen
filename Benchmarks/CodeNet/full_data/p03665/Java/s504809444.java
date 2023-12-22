import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
      
        int oddCount = 0;
        int evenCount = 0;
        for (int i = 0; i < n; i++) {
            if (sc.nextInt() % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }

        long combSum = 0;
        for (long l = p % 2; l <= oddCount; l += 2)
            combSum += combination(oddCount, l);

        System.out.println(combSum * (long) Math.pow(2, evenCount));
    }

    static long combination(long n, long r) {
        if (n - r < r)
            return combination(n, n - r);

        long ans = 1;
        for (long k = n; k > n - r; k--)
            ans *= k;
        for (long k = r; k >= 2; k--)
            ans /= k;
        return ans;
    }
}
