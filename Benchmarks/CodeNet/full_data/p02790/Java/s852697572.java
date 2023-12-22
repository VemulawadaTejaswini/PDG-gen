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
        for(int i = 0; i < a; i++){
            builder.append(b);
        }
        return builder.toString();
    }
}