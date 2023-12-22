import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String s = sc.next();
        char[] alpha = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};        
        char[] c = new char[s.length()];
        
        for(int i=0; i<s.length(); i++){
            c[i] = s.charAt(i);
            int flg = 0;
            
            for(int j=0; j<26; j++){
                if(c[i]==alpha[j] && flg==0){
                    if(j+n<26){
                        //System.out.print(c[i]);
                        c[i] = alpha[j+n];
                    }else if(j+n>=26){
                        //System.out.print(c[i]);
                        c[i] = alpha[j+n-26];
                    }
                    flg=1;
                }
            }
            System.out.print(c[i]);
        }
        
        //System.out.println();
    }
}