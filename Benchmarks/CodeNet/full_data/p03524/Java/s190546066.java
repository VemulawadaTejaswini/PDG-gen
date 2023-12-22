import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String S = sc.next();
        int a = 0;
        int b = 0;
        int c = 0;
        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i) == 'a')
                a++;
            else if(S.charAt(i) == 'b')
                b++;
            else
                c++;
        }

        if(Math.max(Math.abs(a-b), Math.max(Math.abs(b-c),Math.abs(c-a))) <= 1)
            System.out.println("YES");
        else
            System.out.println("NO");
   }
}