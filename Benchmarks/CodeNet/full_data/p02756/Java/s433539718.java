import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        StringBuffer s=new StringBuffer(sc.next());
        int q=sc.nextInt();
        boolean direction=true;
        for(int i=0;i<q;i++){
            int t=sc.nextInt();
            if(t==1){
                direction=!direction;
            }else{
                int f=sc.nextInt();
                char c=sc.next().charAt(0);
                if(direction==(f==1)){
                    s.insert(0,c);
                }else{
                    s.insert(s.toString().length(),c);
                }
            }
        }
        String str=s.toString();
        int l=str.length();
        for(int i=0;i<l;i++){
            System.out.print(str.charAt(direction?i:l-i-1));
        }
        System.out.println();
    }
}