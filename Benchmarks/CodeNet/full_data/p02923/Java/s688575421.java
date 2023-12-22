import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        
        int N = Integer.parseInt(input1);
        String[] ns = input2.split(" ");
        
        int ans = 0;
        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = i + 1; j < N; j++) {
                int a = Integer.parseInt(ns[j - 1]);
                int b = Integer.parseInt(ns[j]);
                if (a >= b) {
                    count++;
                } else {
                    ans = Math.max(ans, count);
                    break;
                }
            }
            ans = Math.max(ans, count);
        }
        System.out.println(ans);
    }
}