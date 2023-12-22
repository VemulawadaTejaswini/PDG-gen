import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        char c[]=S.toCharArray();
        char ch[]={'a','b','c'};
        boolean b=false;
        for(int i=0;i<c.length;i++){
            for(int j=0;j<ch.length;j++){
                if(c[i]==ch[j]) b=true;
                else{
                    b=false;
                }
            }
        }
        if(b) System.out.println("Yes");
        else System.out.println("No");
    }
}