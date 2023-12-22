import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        String N = sc.next();
        int count = 0;
        
        for(int i = 0; i < 3; i++){
            if( N.charAt(i) == '1') count++;
        }
        System.out.println(count);
    }
}
