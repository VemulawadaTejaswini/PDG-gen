import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        String s = scan.next();
        boolean b = true;
        for(int i = 0; i < s.length(); i++){
            if(i % 2 == 0 && b){
                if(s.charAt(i) == 'R' || s.charAt(i) == 'U' || s.charAt(i) == 'D'){
                    b = true;
                }else{
                    b = false;
                }
            }else if(b){
                if(s.charAt(i) == 'L' || s.charAt(i) == 'U' || s.charAt(i) == 'D'){
                    b = true;
                }else{
                    b = false;
                }
            }
        }
        if(b){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}