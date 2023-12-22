import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder str = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            if((i+1) % 2 != 0) {
                str.append(s.charAt(i));
            }
        }
        System.out.println(str.toString());
    }
}
