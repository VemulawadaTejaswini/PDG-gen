import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        String s = scanner.next();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                for (int j = i; j < s.length(); j++) {
                    if(s.charAt(j) == '.'){
                      ++count;
                    }
                }
                break;
            }
        }
        System.out.println(count);

    }
}
