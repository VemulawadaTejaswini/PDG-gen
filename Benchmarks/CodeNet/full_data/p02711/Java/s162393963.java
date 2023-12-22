import java.util.*;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] n = sc.next().toCharArray();
        for(int i = 0 ; i< n.length; i++){
            if(n[i] == '7'){
                System.out.println("Yes");
                exit(0);
            }
        }
        System.out.println("No");
    }
}
