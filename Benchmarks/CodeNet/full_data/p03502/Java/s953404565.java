import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = solve(n);

        System.out.println(ans);
    }

    public static String solve(int n) {
        String str = String.valueOf(n);
        char[] chars = str.toCharArray();
        int sum = 0;
        for (char item: chars) {
            sum += Character.getNumericValue(item);
        }
        String answer = (n % sum == 0) ? "Yes" : "No";
        return answer;
    }



}
