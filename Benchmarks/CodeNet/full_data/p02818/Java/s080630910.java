

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long a=in.nextLong(),b=in.nextLong(),k=in.nextLong();
        if(a<=k) {
            k-=a;
            a=0;
        }
        else a-=k;
        if(b<=k) {
            b=0;
            k-=b;
        }
        else b-=k;
        System.out.println(a+" "+b);
    }
}
