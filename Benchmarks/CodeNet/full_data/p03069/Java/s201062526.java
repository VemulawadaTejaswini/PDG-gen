import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        String s = scanner.next();
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                for (int j = i; j < s.length(); j++) {
                    if(s.charAt(j) == '.'){
                        ++count1;
                    }
                }
                break;
            }
        }
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '.') {
                if(s.charAt(i - 1) == '#'){
                    ++count2;
                }
            }
        }
        System.out.println(Math.min(count1, count2));

    }
}
