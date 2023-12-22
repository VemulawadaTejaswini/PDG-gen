import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int l = s.length();
        String a = "AZ";
        int x = 0;
        int y = 0;

        for(int i=0; i<l; i++){
            if(s.charAt(i)==a.charAt(0)){
                x = i;
                break;
            }
        }
        for(int i=l-1; i>=0; i--){
            if(s.charAt(i)==a.charAt(1)){
                y = i;
                break;
            }
        }
        System.out.println(y - x + 1);
    }
}