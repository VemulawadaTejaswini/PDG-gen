import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        HashMap<Character, Integer> count = new HashMap<>();
        for(Character c: input.toCharArray()){
            if(count.containsKey(c))
                count.replace(c, count.get(c) + 1);
            else
                count.put(c, 1);
        }
        for(Character c: count.keySet()){
            if(count.get(c) % 2 == 1){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
