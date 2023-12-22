import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] array = sc.nextLine().toCharArray();

        Set<Character> list = new HashSet<Character>();
        for(Character c: array) {
            list.add(c);
        }

        for(char ch = 'a'; ch<='z'; ch++) {
            if(!list.contains(ch)) {
                System.out.println(ch);
                System.exit(0);
            }
        }
        System.out.println("None");
    }
}
