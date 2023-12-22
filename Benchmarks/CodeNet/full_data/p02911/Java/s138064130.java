import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();
        int[] score = new int[n];
        for (int i = 0; i < q; i++) {
            score[sc.nextInt() - 1]++;
        }

        String result = "";
        for (int i = 0; i < n; i++) {
            if (score[i] + (k - q) <= 0){
                result += "No\n";
            } else{
                result += "Yes\n";
            }
        }

        System.out.println(result);
    }
}
