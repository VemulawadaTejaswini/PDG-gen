import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char[]ss=new char[s.length()];
        for(int i=0;i<s.length();i++){
            ss[i]=s.charAt(i);
        }
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                System.out.print(ss[i]);
            }
        }

        
        
        
     
    }
}