import java.util.*;

public class Main{
    static String S, T;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        S = sc.next();
        T = sc.next();
        char[] c = new char[S.length()];
        for(int i = 0; i < c.length; i++)
            c[i] = S.charAt(i);
        sc.close();

        for(int i = S.length()-1; i >= T.length()-1; i--){
            if(check(i)){
                for(int j = T.length()-1; j >= 0; j--){
                    c[i-j] = T.charAt(T.length()-1-j);
                }
                for(int j = 0; j < c.length; j++){
                    if(c[j] == '?')
                        System.out.print('a');
                    else
                        System.out.print(c[j]);
                }
                return;
            }
        }
        System.out.println("UNRESTORABLE");
    }

    static boolean check(int n){
        int index = T.length()-1;
        for(int i = n; i >= n-T.length()+1; i--){
            if(S.charAt(i) == T.charAt(index) || S.charAt(i) == '?'){
            } else {
                return false;
            }
            index--;
        }
        return true;
    }
}