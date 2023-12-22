import java.util.*;
import static java.lang.System.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int kosu=0;
        for(int i=0;i<N;i++){
            if(S.charAt(i)=='A'){
                if(S.charAt(i+1)=='B'){
                    if(S.charAt(i+2)=='C'){
                        kosu+=1;
                    }
                }
            }
        }
        out.print(kosu);
        
    }
}