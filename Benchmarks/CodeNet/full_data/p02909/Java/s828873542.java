import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        String ans = "";
        if(S.equals("Sunny")) {
            ans = "Cloudy";
        } else if(S.equals("Cloudy")) {
            ans = "Rainy";
        } else {
            ans = "Sunny";
        }


        System.out.println(ans);
    }
}
