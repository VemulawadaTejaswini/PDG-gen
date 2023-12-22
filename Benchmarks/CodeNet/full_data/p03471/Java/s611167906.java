import java.util.*;
import java.io.*;

public class Main {
    public static String solve(int N, int Yen){
        int x = Yen/10000;
        int y = 0;
        int z = (Yen%10000)/1000;
        if(x+y+z>N) return "-1 -1 -1";
        
        int difference = N - (x+y+z);
        
        int thousandPlus = difference/9;
        x -= thousandPlus;
        z += (thousandPlus*10);
        
        int fivethPlus = difference%9;
        x -= fivethPlus;
        y += (fivethPlus*2);
        
        assert x+y+z==N;
        
        return x>=0 ? (x+" "+y+" "+z) : "-1 -1 -1";
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Yen = sc.nextInt();
        
        System.out.println(solve(N,Yen));
    }
}