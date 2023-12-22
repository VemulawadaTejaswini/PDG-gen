import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String chara = scan.nextLine();
        int count = 0;
        for (char c :chara.toCharArray()) {
            if (c == '+') {
                count++;
            } else {
                count--;
            }
        }
        System.out.println(count);
    }
}
