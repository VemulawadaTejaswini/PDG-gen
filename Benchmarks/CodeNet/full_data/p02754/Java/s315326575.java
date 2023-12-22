import java.util.*;

public class Main{
    public static void main(String[]args){
        long a=0,b=0,c=0;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        long d=0;
        d=a%(b+c);
        if(d>c)
        System.out.println(b+(d-c));
        else
        System.out.println(b+d);
    }
}