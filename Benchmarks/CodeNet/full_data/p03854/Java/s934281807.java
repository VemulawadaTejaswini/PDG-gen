import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);) {
            String src = sc.nextLine();
            String res = src.replaceAll(word, "dream").replaceAll(word, "dreamer").replaceAll(word, "erase").replaceAll(word, "eraser");
            System.out.println(res.length() == 0 ? "YES" : "NO");
        }
    }
}