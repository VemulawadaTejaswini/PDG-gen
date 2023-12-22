import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        StringBuffer s=new StringBuffer(sc.next());
        int q=sc.nextInt(),t=0,f=0;
        String c="";
        int l=s.length();
        boolean direction=true;
        for(int i=0;i<q;i++){
            t=sc.nextInt();
            if(t==1){
                direction=!direction;
            }else{
                f=sc.nextInt();
                c=sc.next();
                if(direction==(f==1)){
                    s.insert(0,c);
                }else{
                    s.insert(l,c);
                }
                l++;
            }
        }
        String str=s.toString();
        if(direction){
            System.out.print(str);
        }else{
            for(int i=l-1;i>=0;i--){
                System.out.print(str.charAt(i));
            }
        }
        System.out.println();
    }
}