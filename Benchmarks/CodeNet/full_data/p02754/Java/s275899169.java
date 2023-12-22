import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n,a,b,tmp;
        n=scan.nextInt();
        a=scan.nextInt();
        b=scan.nextInt();
        tmp=n/(a+b);
        tmp*=a;
        if(n%(a+b)<a) tmp+=n%(a+b);
        else tmp+=a;
        System.out.println(tmp);
    }
}