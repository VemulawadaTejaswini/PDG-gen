import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        int ans = 0;

        for (int i = 0; i<a.length();i++){
            if (a.charAt(i) == '1')
                ans+=1;
        }

        System.out.println(ans);
    }
}
