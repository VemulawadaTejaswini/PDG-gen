import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        String S = sc.next();
        char[]ss = S.toCharArray();

            if(ss[K-1]=='A'){
                ss[K-1]='a';
                System.out.println(String.valueOf(ss)); 
            }else if(ss[K-1]=='B'){
                 ss[K-1]='b';
                System.out.println(String.valueOf(ss)); 
            }else{
                 ss[K-1]='c';
                System.out.println(String.valueOf(ss));            
            }
 	    }
}
