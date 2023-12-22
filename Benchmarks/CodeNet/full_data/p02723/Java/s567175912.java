import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        char[]a=str.toCharArray();
        if(a[2]==a[3] && a[4]==a[5])
        System.out.println("yes");
        else
        System.out.println("no");
        
    }
}