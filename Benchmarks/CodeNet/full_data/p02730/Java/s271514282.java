import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        String s = scan.next();
        int a = 0;
        int b = 0;
        for(int i = 0; i < (s.length() - 1) / 2; i++){
            if(s.charAt(i) == s.charAt(s.length() - i - 1)){
                a++;
            } 
        }
        if(a != (s.length() - 1) / 2){
                System.out.println("No");
                System.exit(0);
        }
        for(int i = 0; i < (s.length() - 1) / 4; i++){
            if(s.charAt(i) == s.charAt((s.length() - 1) / 2 - 1 - i)){
                if(s.charAt((s.length() + 3) / 2 - 1 + i) == s.charAt(s.length() - i - 1)){
                    b++; 
                }
            }
        }
        if(b != s.length() / 4){
            System.out.println("No");
            System.exit(0);
        }
        System.out.println("Yes");
    }
}