import java.util.*;
import static java.lang.Math.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long k = sc.nextLong();
        int memo = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!=1){
                memo = i;
                break;
            }
        }

        if(k<memo){
            System.out.println(s.charAt(0));
        }else{
            System.out.println(s.charAt(memo+1));
        }
    }
}