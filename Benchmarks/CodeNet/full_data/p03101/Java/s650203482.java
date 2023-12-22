
import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
        solve();
    }

    public static void solve(){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int ch = sc.nextInt();
        int cw = sc.nextInt();
        System.out.println(h*w + ch*cw - h*cw - w*ch);
    }
}