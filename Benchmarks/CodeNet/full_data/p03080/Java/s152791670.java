import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();

        int red = 0, blue = 0;
        for(int n=0; n<N; n++){
            if(S.charAt(n)=='R') red++;
            else blue++;
        }
        System.out.println(red>blue ? "Yes" : "No");


    }
}
