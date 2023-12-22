import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        StringBuffer frontString=new StringBuffer("");
        StringBuffer backString=new StringBuffer("");
        int q=sc.nextInt(),t=0,f=0;
        String c="";
        boolean direction=true;
        for(int i=0;i<q;i++){
            t=sc.nextInt();
            if(t==1){
                direction=!direction;
            }else{
                f=sc.nextInt();
                c=sc.next();
                if(direction==(f==1)){
                    frontString.insert(0,c);
                }else{
                    backString.insert(0,c);
                }
            }
        }
        if(direction){
            System.out.print(frontString.toString() + str);
            int l=backString.length();
            for(int i=l-1;i>=0;i--){
                System.out.print(backString.charAt(i));
            }
            System.out.println();
        }else{
            int l=str.length();
            System.out.print(backString.toString());
            for(int i=l-1;i>=0;i--){
                System.out.print(str.charAt(i));
            }
            l=frontString.length();
            for(int i=l-1;i>=0;i--){
                System.out.print(frontString.charAt(i));
            }
            System.out.println();
        }
    }
}