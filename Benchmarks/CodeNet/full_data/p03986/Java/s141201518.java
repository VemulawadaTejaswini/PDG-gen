import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = null;
        try {
            scan = new Scanner(System.in);
            System.out.println(replace(scan.nextLine()).length());
        } finally {
            if (scan != null) {
                scan.close();
            }
        }
    }

    private static String replace(String str) {
        if (str.contains("ST")) {
            return replace(str.replace("ST", ""));
        }
        return str;
    }
}