import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int p = Integer.valueOf(a + b);
        String res = "No";
        for(int i = 1; i * i <= p; i++) {
            if(i * i == p) {
                res = "Yes";
                break;
            }
        }
        System.out.println(res);
    }

}
