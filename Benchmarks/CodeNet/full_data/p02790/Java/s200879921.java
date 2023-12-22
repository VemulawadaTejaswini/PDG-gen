import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String answer = "";
        if(a > b){
            answer = createString(a, b);
        } else {
            answer = createString(b, a);
        }
        System.out.println(answer);
    }

    private static String createString(int a, int b) {
        StringBuilder builder = new StringBuilder();
        builder.append(String.valueOf(b).repeat(Math.max(0, a)));
        return builder.toString();
    }
}