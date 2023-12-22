import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        List<Character> s=new ArrayList<>();
        int l=str.length();
        for(int i=0;i<l;i++){
            s.add(str.charAt(i));
        }
        int q=sc.nextInt();
        boolean direction=true;
        int t=0,f=0;
        char c=0;
        for(int i=0;i<q;i++){
            t=sc.nextInt();
            if(t==1){
                direction=!direction;
            }else{
                f=sc.nextInt();
                c=sc.next().charAt(0);
                if(direction==(f==1)){
                    s.add(0,c);
                }else{
                    s.add(c);
                }
                l++;
            }
        }
        if(direction){
            for(int i=0;i<l;i++){
                System.out.print(s.get(i));
            }
        }else{
            for(int i=l-1;i>=0;i--){
                System.out.print(s.get(i));
            }
        }
        System.out.println();
    }
}