import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        long ans = 2;
        for(int i=0;i<X;i++){
            ans = 2*ans+2;
        }
        System.out.println(ans);
    }
}
