import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        String s=sc.next();
        int x=700;
        if(s.substring(0,1).equals("o")){
            x+=100;
        }
        if(s.substring(1,2).equals("o")){
            x+=100;
        }
        if(s.substring(2,3).equals("o")){
            x+=100;
        }
        System.out.println(x);
    }
}


