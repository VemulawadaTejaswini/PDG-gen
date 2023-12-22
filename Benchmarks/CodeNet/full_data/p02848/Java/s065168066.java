import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();

        for (int i=0;i<s.length();i++){
            System.out.print((char) ((s.charAt(i)-'A'+ n)%26 + 'A'));
        }
    }
}