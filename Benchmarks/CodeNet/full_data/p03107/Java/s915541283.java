import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String initText = sc.next();

        String current = initText;
        int removeCount = 0;
        do {
            int idx01 = current.indexOf("01");
            int idx10 = current.indexOf("10");
            String removePattern = null;
            if (idx01 >= 0 && idx10 >= 0) {
                removePattern = idx01 < idx10 ? "01" : "01";
            } else if (idx01 >= 0) {
                removePattern = "01";
            } else if (idx10 >= 0) {
                removePattern = "10";
            } else {
                break;
            }
            removeCount += 2;
            current = current.replaceFirst(removePattern, "");
        } while (true);

        System.out.println(removeCount);
    }
}