import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        String s = sc.next();
        
        sb.append(s);
        sb.insert(4, " ");
        
        System.out.println(new String(sb));
        
        sc.close();
        
    }
}
