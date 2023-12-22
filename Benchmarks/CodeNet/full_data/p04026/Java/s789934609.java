import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        


        String s = in.next();
        
        int f = -1, l = -1;
        
        for (int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i) == s.charAt(i + 1)){
                f = i + 1;
                l = i + 2;
                break;
            }
            else if(i < s.length() - 2){
                if(s.charAt(i) == s.charAt(i + 2)){
                    f = i + 1;
                    l = i + 3;
                    break;
                }
            }
        }
        System.out.println(f + " " + l);
    }
}
