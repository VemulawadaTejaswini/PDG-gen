import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        String result = new String();
        for(int i = 0;i<s.length();i++){
            result.concat(new String(s.charAt(i)));
            result.concat(new String(t.charAt(i)));
        }
        System.out.println(result);
        sc.close();
    }
}