import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Map<String, String> map = new HashMap<>();

        String s = sc.next();
        map.put(s, s);
        for(int i = 0; i < n - 1; i++){
            String next = sc.next();
            if(map.containsKey(next)){
                System.out.println("No");
                return;
            }
            if(s.charAt(s.length() - 1) != next.charAt(0)){
                System.out.println("No");
                return;
            }
            map.put(next, next);
            s = next;
        }

        System.out.println("Yes");

    }
}
