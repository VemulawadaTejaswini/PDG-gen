import java.io.*;
import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        int i,x,y,z,ans;
        long max=1;
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        long k = scanner.nextLong();
        for(i=0;i<k;i++){
            x = b + c;
            y = a + c;
            z = a + b;
            a = x;
            b = y;
            c = z;
        }
        for(i=0;i<18;i++){
            max*=10;
        }
        ans = a - b;
        if(ans <= max && ans >= -max){
            System.out.println(ans);
        } else {
            System.out.println("Unfair");
        }
        scanner.close();
    }
}