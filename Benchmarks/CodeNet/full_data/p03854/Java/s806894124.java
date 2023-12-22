
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
                String p = check(s);
                if(p.equals("NG")){
                    System.out.println("NG");
                    return;
                }
                if(p.length()==0){
                    System.out.println("YES");
                    return;
                }
                s = p;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String check(String s){
        if (s.endsWith(DREAM) || s.endsWith(ERASE)) {
            return s.substring(0, s.length()-5);
        } else if (s.endsWith(DREAMER)) {
            return s.substring(0, s.length()-7);
        } else if (s.endsWith(ERASER)) {
            return s.substring(0, s.length()-6);
        } else {
            return "NG";
        }
    }
}