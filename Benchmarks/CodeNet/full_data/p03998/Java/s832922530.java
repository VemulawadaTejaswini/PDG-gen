import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S1 = sc.next();
        String S2 = sc.next();
        String S3 = sc.next();
        boolean test = true;
        String ans = "";
        char ch = 'a';
        
        while(test){
            if(ch == 'a'){
                if(S1.length()>1){
                    ch = S1.charAt(0);
                    S1 = S1.substring(1,S1.length());
                    //System.out.println(ch+":"+S1);
                }else if(S1.length()==1){
                    ch = S1.charAt(0);
                    S1 = "";
                    //System.out.println(ch+":"+S1);
                }else{
                    ans = "A";
                    test = false;
                }
            }else if(ch == 'b'){
                if(S2.length()>1){
                    ch = S2.charAt(0);
                    S2 = S2.substring(1,S2.length());
                    //System.out.println(ch+":"+S2);
                }else if(S2.length()==1){
                    ch = S2.charAt(0);
                    S2 = "";
                    //System.out.println(ch+":"+S2);
                }else{
                    ans = "B";
                    test = false;
                }
            }else{
                if(S3.length()>1){
                    ch = S3.charAt(0);
                    S3 = S3.substring(1,S3.length());
                    //System.out.println(ch+":"+S3);
                }else if(S3.length()==1){
                    ch = S3.charAt(0);
                    S3 = "";
                    //System.out.println(ch+":"+S3);
                }else{
                    ans = "C";
                    test = false;
                }
            }
        }
        System.out.println(ans);
    }
}
