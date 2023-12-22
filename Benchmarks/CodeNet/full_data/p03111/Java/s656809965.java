import java.util.Scanner;

public class Main {
    static int A;
    static int B;
    static int C;
    static int minCost = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        dfs(arr, 0, 0, 0, 0, 0);
        System.out.println(minCost);
    }

    static void dfs(int[] arr, int idx, int currCost, int a, int b, int c) {
        if (idx == arr.length) {
            if (a == 0 || b == 0 || c == 0) return;
            currCost += Math.abs(A-a) + Math.abs(B-b) + Math.abs(C-c) - 30;
            minCost = Math.min(minCost, currCost);
            return;
        }
        dfs(arr, idx+1, currCost+10, a + arr[idx], b, c);
        dfs(arr, idx+1, currCost+10, a, b + arr[idx], c);
        dfs(arr, idx+1, currCost+10, a, b, c + arr[idx]);
        dfs(arr, idx+1, currCost, a, b, c);
    }
}