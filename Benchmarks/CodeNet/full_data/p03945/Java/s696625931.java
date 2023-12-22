import java.util.*;

public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String S = sc.next();
        sc.close();
    
        int count = 0;
        int idx = 0;
        while(idx < S.length()-1){
            if(S.charAt(idx) != S.charAt(idx+1)){
                count++;
            }
            idx++;
        }

        System.out.println(count);
    }
}