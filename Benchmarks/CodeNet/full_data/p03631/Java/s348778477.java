import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int L = N.length();
        boolean ans = true;
        for(int i=0;i<1+L/2;i++){
        	if(N.charAt(i)!=N.charAt(L-1-i)) ans = false;
        }
        if(ans) System.out.println("Yes");
        else System.out.println("No");
    }
}