import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        boolean cf = false;
        for (int i = 0; i < line.length(); ++i) {
            if (line.charAt(i) == 'C') {
                for (int j = i; j < line.length(); ++j) {
                    if (line.charAt(j) == 'F') {
                        cf = true;
                        break;
                    }
                }
                break;
            }
        }
        System.out.println(cf ? "Yes" : "No");
    }
}
