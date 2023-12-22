import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String[] strArray = str.split("");
        Map<String,Integer> map = new HashMap<>();
        for(String s: strArray){
            if(map.get(s) == null) map.put(s,1);
            else map.put(s,map.get(s)+1);
        }

        if(map.size() == 2) System.out.println("Yes");
        else System.out.println("No");
    }
}
