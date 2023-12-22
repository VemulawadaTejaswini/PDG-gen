import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sdash = sc.next();
        String t = sc.next();
        String[] sdashArr = sdash.split("");
        String[] tArr = t.split("");

        boolean replaced = false;
        for (int i = 0; i < sdash.length() - t.length() + 1; i++) {
            boolean matched = true;
            for (int j = 0; j < t.length(); j++) {
                if (!sdashArr[i + j].equals(tArr[j]) && !sdashArr[i + j].equals("?")) {
                    matched = false;
                    break;
                }
            }
            if (matched) {
                String sdash1 = sdash.substring(0, i);
                String sdash2 = sdash.substring(i + t.length());
                sdash = sdash1 + t + sdash2;
                replaced = true;
            }
        }
        if (!replaced) {
            System.out.println("UNRESTORABLE");
            return;
        }
        String result = sdash.replaceAll("\\?", "a");
        System.out.println(result);
    }

}
