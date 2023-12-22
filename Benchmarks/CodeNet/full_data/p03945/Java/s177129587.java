import java.util.*;
import static java.lang.Math.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char a[] = new char[s.length()];
        a = s.toCharArray();
        int cnt = 0;
        for(int i=0; i<s.length()-1; i++){
            if(a[i] != a[i+1]){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}