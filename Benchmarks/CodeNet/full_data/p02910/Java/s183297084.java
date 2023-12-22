import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        String ans = "Yes";
        for(int i = 0; i < S.length(); i ++) {
            Character c = S.charAt(i);
            int oddeven = (i+1) % 2;
            if((c.equals('R') && oddeven == 0) || (c.equals('L') && oddeven == 1)) {
                ans = "No";
             break;
            }
        }


        System.out.println(ans);
    }
}
