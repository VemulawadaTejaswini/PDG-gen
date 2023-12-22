import java.util.*;
import java.util.Collections;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        String T = sc.next();
        int l = S.length();

        loop:for(int i=0; i<l; i++){
            for(int j=0; j<l; j++){
                if(S.charAt((j+i)%l)!=T.charAt(j)){
                    break;
                }
                else{
                    if(j==l-1){
                        System.out.println("Yes");
                        break loop;
                    }
                }
            }
            if(i==l-1){
                System.out.println("No");
            }
        }

    }
}