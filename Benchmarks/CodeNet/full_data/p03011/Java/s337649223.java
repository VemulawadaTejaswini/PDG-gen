import java.io.*;
import java.util.*;

public class Main{
    
    public static void main(String[] arg){
        Scanner scan =new Scanner(System.in);
        int p=scan.nextInt();
        int q=scan.nextInt();
        int r=scan.nextInt();

        int r1=p+q;
        int r2=p+r;
        int r3=q+r;

        if(r1<=r2 && r1<=r3) System.out.print(r1);
        else if(r2<=r1 && r2<=r3) System.out.print(r2);
        else System.out.print(r3);

    }
}