import java.util.*;
import static java.lang.Math.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        char s[] = new char[n+3];
        boolean flag = true;
        s = sc.next().toCharArray();
        if(c<d){
            for(int i = a; i<=c-2; i++){
                if(s[i]=='#' && s[i+1]=='#'){
                    flag = false;
                }
            }
            if(flag){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            return;
        }else{
            flag = false;
            boolean temp = false;
            for(int i = b-2; i<= d-2; i++){
                if(s[i] == '.' && s[i+1] == '.' && s[i+2] == '.'){
                    temp = true;
                }
            }
            if((c-1 == d) && s[d-2] == '#'){
                flag = false;
            }
            if(s[c-2] == '.' && s[c-3] == '.'){
                flag = true;
            }
            if((c-1 == d) && s[d-2] == '.'){
                flag = true;
            }
            for(int i = a; i<= n-1; i++){
                if(s[i]=='#' && s[i+1]=='#' && s[d-2] == '.'){
                    flag = false;
                }
            }
            
            if(flag){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }  
    }
}
