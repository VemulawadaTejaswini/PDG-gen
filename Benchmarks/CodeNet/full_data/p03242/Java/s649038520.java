import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        
        StringBuilder ans = new StringBuilder();
        
        for (int i = 0; i<n.length();i++) {
            if (n.charAt(i) == '1')
                ans.append('9');
            else if (n.charAt(i) == '9')
                ans.append('1');
        }
        System.out.println(ans);
    }
}
