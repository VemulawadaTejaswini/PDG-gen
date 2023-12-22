import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        String ans = "";

        if(a == 5) {
            if(b == 7 && c == 7) {
                ans = "YES";
            } else {
                ans = "NO";
            }
        } else if(b == 5) {
            if(a == 7 && c == 7) {
                ans = "YES";
            } else {
                ans = "NO";
            }
        } else if(c == 5) {
            if(a == 7 && b == 7) {
                ans = "YES";
            } else {
                ans = "NO";
            }
        } else {
            ans = "NO";
        }

        System.out.println(ans);

        in.close();
    }
}
