import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        int start = scan.nextInt();
        int end = scan.nextInt();
        int ans = 0;
        
        for(int i = start; i <= end; i++){
            if(i/1000 == underHundred(i))
                ans++;
        }
        
        System.out.println(ans);
    }
    
    private static int underHundred(int i){
        int temp = i%100;
        return temp%10*10 + temp/10;
    }
}
