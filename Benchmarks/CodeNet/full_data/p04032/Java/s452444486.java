import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        int l = s.length();
        
        for(int i=0; i<l; i++){
            if(i<l-1){
                if(s.charAt(i)==s.charAt(i+1)){
                    System.out.println(i + 1 + " " + (i + 2));
                    return;
                }
            }
            if(i<l-2){
                if(s.charAt(i)==s.charAt(i+2)){
                    System.out.println(i + 1 + " " + (i + 3));
                    return;
                }
            }
        }
        System.out.println("-1 -1");
    }
}