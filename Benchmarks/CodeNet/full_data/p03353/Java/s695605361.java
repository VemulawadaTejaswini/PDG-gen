import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = sc.next();
        int K = sc.nextInt();
        TreeSet<String> set = new TreeSet<>();

        for (int i = 1; i <= str.length(); i++) {
            for (int j = 0; j < str.length() - (i  - 1); j++) {
                set.add(str.substring(j, j + i));
            }
        }
        
        int count = 0;
        for (String subStr : set) {
            count++;
            if (count == K) {
                System.out.println(subStr);
            }
        }
    }
}