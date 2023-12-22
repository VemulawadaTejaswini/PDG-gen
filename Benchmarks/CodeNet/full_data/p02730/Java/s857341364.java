import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static boolean is_kaibun(String s){
        for(int i = 0;i < s.length()/2+1;i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(is_kaibun(s) && is_kaibun(s.substring(0, (s.length()-1)/2)) && is_kaibun(s.substring((s.length()+2)/2,s.length()))){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}