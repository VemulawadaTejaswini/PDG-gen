import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        boolean out = false;
        if(s.charAt(0) == s.charAt(1)){
            if(s.charAt(2) == s.charAt(3)){
                out = true;
            }
        }else if(s.charAt(0) == s.charAt(2)){
            if(s.charAt(1) == s.charAt(3)){
                out = true;
            }
        }else if(s.charAt(0) == s.charAt(3)){
            if(s.charAt(1) == s.charAt(2)){
                out = true;
            }
        }
        if(s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(2) && s.charAt(2) == s.charAt(3)){
            out = false;
        }
        if(out){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}