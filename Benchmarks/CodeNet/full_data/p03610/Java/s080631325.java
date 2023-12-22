import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String result = "";

        for(int i = 0; i < s.length(); i++) {
            if((i+1) % 2 != 0) {
                result += s.charAt(i);
            }
        }
        System.out.println(result);
    }
}
