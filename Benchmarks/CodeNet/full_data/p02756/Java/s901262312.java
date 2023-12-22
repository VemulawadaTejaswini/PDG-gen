import java.util.*;

public class Main {
    public static String reverse(String S){
        int len=S.length();
        String T="";
        for(int i=len-1;i>=0;i--){
            T+=S.charAt(i);
        }
        return T;
    }
    
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        String T=S;
        int Q=sc.nextInt();
        for(int i=0;i<Q;i++){
            int tmp=sc.nextInt();
            if(tmp==1){
                T=reverse(T);
            }else{
                int tmp2=sc.nextInt();
                String tmpstring=sc.next();
                char tmpchar=tmpstring.charAt(0);
                if(tmp2==1){
                    S=tmpchar+T;
                    T=S;
                }else{
                    T+=tmpchar;
                }
            }
        }
        
        System.out.println(T);
    }
}
