import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int ln = s.length();
        s = s.substring(0, ln - 1);

        loop:for(int i=1; i<=200; i++){
            int l = s.length();
            if(l%2==0){
                for(int j=0; j<l/2; j++){
                    if(s.charAt(j)!=s.charAt(l/2+j)){
                        break;
                    }
                    if(j==l/2-1){
                        System.out.println(l);
                        break loop;
                    }
                }
            }
            s = s.substring(0, l - 1);
        }
    }
}