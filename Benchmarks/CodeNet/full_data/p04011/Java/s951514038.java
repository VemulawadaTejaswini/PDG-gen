import java.util.*;

public class MMain{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.next());
        int k=Integer.parseInt(sc.next());
        int x=Integer.parseInt(sc.next());
        int y=Integer.parseInt(sc.next());
        sc.close();
        if(n>=k)
            System.out.println(k*x+(n-k)*y);
        else
        System.out.println(n*x);
    }
}