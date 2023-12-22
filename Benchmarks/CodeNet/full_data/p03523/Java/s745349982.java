import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String in = sc.next();
        String[] kouho = {"AKIHABARA", "KIHABARA", "AKIHBARA", "AKIHABRA", "AKIHABAR",
    "KIHBARA", "KIHABRA", "KIHABAR", "AKIHBRA", "AKIHBAR", "AKIHABR", "KIHBR" };
        String ans = "NO";

        for (String str : kouho) {
            if (in.equals(str)) {
                ans = "YES";
                break;
            }
        }
        
        System.out.println(ans);
    }
}
