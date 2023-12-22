import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        char[] c = new char[n];
        int out = 0;
        for(int i = 0; i < n; i++){
            c[i] = s.charAt(i);
        }
        for(int i = 0; i < n - 2; i++){
            if(c[i] == 'A' && c[i + 1] == 'B' && c[i + 2] == 'C'){
                out++;
            } 
        }
        System.out.println(out);
    }
}