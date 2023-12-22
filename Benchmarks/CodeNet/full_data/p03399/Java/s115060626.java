import java.io.BufferedReader;
import java.util.Scanner;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        int a,b,c,d,sum;
        Scanner sn=new Scanner(System.in);
        a=sn.nextInt();
        b=sn.nextInt();
        c=sn.nextInt();
        d=sn.nextInt();
        if(a<=b) sum=a;
        else sum=b;
        if(c<=d) sum+=c;
        else sum+=d;
        System.out.println(sum);
    }
}