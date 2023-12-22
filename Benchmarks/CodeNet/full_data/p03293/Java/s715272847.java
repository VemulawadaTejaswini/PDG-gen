import java.util.*;

public class Main {


    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       String str1 = sc.nextLine();
       String str2 = sc.nextLine();

       if(str1.length() != str2.length()) {
           System.out.println("No");
       }
       Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            if(map.containsKey(str1.charAt(i))) {
                map.put(str1.charAt(i), map.get(str1.charAt(i)) + 1);
                continue;
            }
            map.put(str1.charAt(i), 1);
        }

        for (int i = 0; i < str2.length(); i++) {
            if(map.containsKey(str2.charAt(i))) {
                map.put(str2.charAt(i), map.get(str2.charAt(i)) - 1);
                continue;
            }
            map.put(str2.charAt(i), 1);
        }

        Collection<Integer> result = map.values();

        for(int i : result) {
            if(i != 0) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }

}
