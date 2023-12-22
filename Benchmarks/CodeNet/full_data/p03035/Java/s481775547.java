import java.io.*;
import java.util.*;

public class ABC127b{
    
    public static void main(String[] arg){

        Scanner scan =new Scanner(System.in);

        int r=Integer.parseInt(scan.next());
        int d=Integer.parseInt(scan.next());
        int x=Integer.parseInt(scan.next());

        for(int i=0;i<10;i++){
            x=r*x-d;
            System.out.println(x);

        }

    }
}