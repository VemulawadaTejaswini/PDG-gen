
import java.util.*;

public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] sa = s.split("");
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < sa.length; i++){
            if(sa[i] == "0" || sa[i] == "1"){
                ans.append(sa[i]);
            }else{
                ans.setLength(ans.length() - 1);
            }
        }
        System.out.println(ans);
    }
}