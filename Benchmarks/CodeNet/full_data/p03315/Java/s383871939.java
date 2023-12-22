import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int p = 0;
        int m = 0;
        String a = "+";

        for(int i=0; i<4; i++){
            if(s.charAt(i)==a.charAt(0)){
                p += 1;
            }
        }
        m = 4 - p;

        System.out.println(p - m);
    }
}