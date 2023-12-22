import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        String S = sc.next();
        sc.close();
        int cntr = 0; //　)の個数
        int cntl = 0; //  (の個数
        int right = 0;
        int left = 0;
        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i) == ')'){
                cntr++;
            }
        }
        cntl = S.length()-cntr;

        while(S.charAt(right) == ')')
            right++;
        while(S.charAt(S.length()-1-left) == '(')
            left++;

        cntr -= right;
        cntl -= left;

        if(cntr == cntl){
            for(int i = 0; i < right; i++)
                System.out.print('(');
            System.out.print(S);
            for(int i = 0; i < left; i++)
                System.out.print(')');
        }
        if(cntr > cntl){
            for(int i = 0; i < right+(cntr-cntl); i++)
                System.out.print('(');
            System.out.print(S);
            for(int i = 0; i < left; i++)
                System.out.print(')');
        }
        if(cntr < cntl){
            for(int i = 0; i < right; i++)
                System.out.print('(');
            System.out.print(S);
            for(int i = 0; i < left+(cntl-cntr); i++)
                System.out.print(')');
        }

    }
}