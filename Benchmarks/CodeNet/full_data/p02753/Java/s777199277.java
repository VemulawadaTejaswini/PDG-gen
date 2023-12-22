import java.util.*;
import java.io.*;
public class Main{
  
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();

        boolean a=false;
        boolean b=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'){
                a=true;
            }else if(s.charAt(i)=='B'){
                b=true;
            }
        }

        if(a&&b){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        


    }
}