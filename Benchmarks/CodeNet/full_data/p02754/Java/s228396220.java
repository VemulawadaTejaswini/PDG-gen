import java.util.*;

public class Main{
    public static void main(String[]args){
        long a=0,b=0,c=0;
        Scanner sc = new Scanner(System.in);
        a=sc.nextLong();
        b=sc.nextLong();
        c=sc.nextLong();
        long d=0,e=0;
        d=a%(b+c);
        e=a/(b+c);
        if(d>c)
        System.out.println(e*b+(d-c));
        else
        System.out.println(e*b+d);
    }
}