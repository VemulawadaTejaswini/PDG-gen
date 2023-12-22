import java.util.*;

public class Main {

    static final int MOD=1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String hitachi = "hi";

        for(int i=0;i<s.length()/2+1;i++){
            if(s.equals(hitachi)){
                System.out.println("Yes");
                return;
            }
            hitachi += "hi";
        }
        System.out.println("No");


    }
}


