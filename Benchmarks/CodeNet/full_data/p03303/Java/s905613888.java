import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int w = sc.nextInt();
        //String ans = "x";
        int i=0;
        while(i<S.length()){
            if(i%w==0) System.out.println(S.charAt(i));
        }
        //System.out.println(ans);
    }
}