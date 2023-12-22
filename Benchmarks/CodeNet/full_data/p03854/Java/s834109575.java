import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        String[] selection = {"dream", "dreamer", "erase", "eraser"};

        if (!S.startsWith("d") && !S.startsWith("e")) {
            System.out.println("NO");
            return;
        }
        boolean splited = true;
        WHILE:
        while (splited) {
            for (String aSelection : selection) {
                if (S.endsWith(aSelection)) {
                    splited = true;
                    String[] split = S.split(aSelection);
                    S = split[0];
                    if (split.length == 1) {
                        System.out.println("Yes");
                        return;
                    }
                    continue WHILE;
                }
            }
            splited = false;
        }

        System.out.println("NO");
    }
}
