import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        int len = S.length();
        StringBuilder bld = new StringBuilder();
        for(int i=0;i<len;i++){
            bld.append("x");
        }
        System.out.println(bld.toString());
    }
}