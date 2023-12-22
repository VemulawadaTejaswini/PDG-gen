import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        String[] t = {"dream", "dreamer", "erase", "eraser"};

        for(String str1: t) {
            for(String str2: t) {
                StringBuilder sb = new StringBuilder();
                if(s.equals(sb.append(str1).append(str2).toString())) {
                    System.out.println("YES");
                    System.exit(0);
                }
            }
        }
        System.out.println("NO");
    }
}
