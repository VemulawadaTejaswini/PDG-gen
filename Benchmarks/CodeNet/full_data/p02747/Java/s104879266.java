import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int l=s.length();
        boolean flag=true;
        char c=s.charAt(0);
        for(int i=1;i<l;i++){
            if(c=='h'){
                if(s.charAt(i)!='i')flag=false;
            }else if(c=='i'){
                if(s.charAt(i)!='h')flag=false;
            }else{
                flag=false;
            }
            c=s.charAt(i);
        }
        if(flag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}