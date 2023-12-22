import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        long n,a,b,tmp;
        n=scan.nextLong();
        a=scan.nextLong();
        b=scan.nextLong();
        tmp=n/(a+b);
        tmp*=a;
        if(n%(a+b)<a) tmp+=n%(a+b);
        else tmp+=a;
        System.out.println(tmp);
    }
}