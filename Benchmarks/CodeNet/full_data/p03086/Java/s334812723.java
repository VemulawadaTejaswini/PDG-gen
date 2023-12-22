import java.util.*;
import java.io.*;


public class Main {
    static boolean isBase(char b){
        return b=='A' || b=='C' || b=='G' || b=='T';
    }
    static boolean isACGT(String s){
        int N = s.length();
        for(int n=0; n<N; n++) if(!isBase(s.charAt(n))) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int N = S.length();

        int ans = 0;
        for(int i=0; i<N; i++) for(int j=i+1; j<N; j++){
            if(isACGT(S.substring(i,j))) ans = Math.max(ans, j-i);            
        }
        System.out.println(ans);
    }
}