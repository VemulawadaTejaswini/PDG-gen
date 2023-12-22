import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.next().split("");
        
        int result = 0;
        for (String s : str) {
            if (s.equals("+")) {
                result++;
            } else {
                result--;
            }
        }
      
        System.out.println(result);
    }
}
