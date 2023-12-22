import java.util.*;
import java.util.HashSet;
import java.util.Set;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        String S=sc.next();
        char[]ss=S.toCharArray();
        int max=0;
        int x=0;
        for(int i=0;i<S.length();i++){
            if(ss[i]=='I'){
                x++;
            }
            if(ss[i]=='D'){
                x--;
            }
            if(max<=x){
                max=x;
            }

        }
        System.out.println(max);

        }
       
        
    }