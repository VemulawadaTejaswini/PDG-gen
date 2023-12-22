import java.util.Scanner;

class Solver {
    void solve(Scanner in) {
        int N = in.nextInt();
        int[] heights = new int[N];
        int prev = 0;
        int sum = 0;
        int max = 0;
        for (int i = 0; i < N; i++) {
            heights[i] = in.nextInt();
            if (prev >= heights[i]){
                prev = heights[i];
                sum++;
            } else {
                prev = heights[i];
                max = Math.max(max, sum);
                sum = 0;
            }
        }
        System.out.println(Math.max(max, sum));
    }
}

class Main {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);

        new Solver().solve(in);

        in.close();
    }
}