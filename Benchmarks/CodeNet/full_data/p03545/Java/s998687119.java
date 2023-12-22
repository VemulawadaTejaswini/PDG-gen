import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        String s=sc.next();
        int temp=Character.getNumericValue(s.charAt(0));
        String ans=String.valueOf(s.charAt(0));
        for (int i = 0; i <(1<<3) ; i++) {
            for (int j = 0; j < 3; j++) {
                if((1&i>>j)==1){
                    temp+=Character.getNumericValue(s.charAt(j+1));
                    ans+="+"+String.valueOf(s.charAt(j+1));
                }else{
                    temp-=Character.getNumericValue(s.charAt(j+1));
                    ans+="-"+String.valueOf(s.charAt(j+1));
                }
            }
            if(temp==7){
                ans+="=7";
                break;
            }else{
                temp=Character.getNumericValue(s.charAt(0));
                ans=String.valueOf(s.charAt(0));
            }
        }
        out.println(ans);
    }
}