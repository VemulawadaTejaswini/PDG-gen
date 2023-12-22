import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String[][] input = new String[N][2];
        for (int i = 0; i < N; i++) {
            String str = sc.nextLine();
            input[i][0] = str.split(" ")[0];
            input[i][1] = str.split(" ")[1];
        }
        double ans = 0.0;
        for (int i = 0; i < input.length; i++) {
            double price = Double.parseDouble(input[i][0]);
            double samePrice = input[i][1].equals("JPY") ? price : price * 380000;
            ans += samePrice;
        }
        System.out.println(ans);
    }
}
