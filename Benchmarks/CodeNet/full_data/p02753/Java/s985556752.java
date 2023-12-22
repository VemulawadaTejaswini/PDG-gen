import com.sun.tools.jdeprscan.scan.Scan;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        Set<String> campanies = new HashSet<>();
        for(char c : s.toCharArray()){
            campanies.add(String.valueOf(c));
        }

        System.out.println(campanies.size() > 1 ? "Yes" : "No");
    }
}
