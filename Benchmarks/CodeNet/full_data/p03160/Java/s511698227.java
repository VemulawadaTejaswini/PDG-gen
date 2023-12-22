import java.util.Scanner;

class Main {

    static int solve(int[] inputs){
        int[] dp = new int[inputs.length];
        dp[0] = 0;
        dp[1] = Math.abs(inputs[0] - inputs[1]);

        for(int i = 2; i < dp.length; i++)
            dp[i] = Math.min(dp[i-1] + Math.abs(inputs[i] - inputs[i-1]), dp[i-2] + Math.abs(inputs[i] - inputs[i-2]));

        return dp[dp.length - 1];
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); scanner.nextLine();
        int[] inputs = new int[n];
        for(int i = 0; i < n; i++)
            inputs[i] = scanner.nextInt();

        System.out.println(Main.solve(inputs));
        scanner.close();
    }
}