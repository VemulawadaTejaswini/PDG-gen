import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int opt=0;
        for(int i=1;i<4;i++) if(S.charAt(i-1)==S.charAt(i)) opt++;
        if(opt==0) System.out.println("Good");
        else System.out.println("Bad");
    }
}