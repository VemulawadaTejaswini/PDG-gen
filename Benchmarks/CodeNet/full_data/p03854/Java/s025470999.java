import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    private static final String DREAM = "dream";
    private static final String DREAMER = "dreamer";
    private static final String ERASE = "erase";
    private static final String ERASER = "eraser";

    public static void main(String[] args) {
        Main instance = new Main();
        instance.solve();
    }

    private void solve() {
        try {
            String s = sc.next();

            while(true) {
                if (s.endsWith(DREAM) || s.endsWith(ERASE)) {
                    s = s.substring(0, s.length()-5);
                } else if (s.endsWith(DREAMER)) {
                    s = s.substring(0, s.length()-7);
                } else if (s.endsWith(ERASER)) {
                    s = s.substring(0, s.length()-6);
                } else {
                    System.out.println("NO");
                    return;
                }
                if(s.length() == 0) {
                    System.out.println("YES");
                    return;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}