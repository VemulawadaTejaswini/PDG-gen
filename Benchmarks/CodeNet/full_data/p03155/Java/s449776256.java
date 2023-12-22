// proxy

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int w = sc.nextInt();
        System.out.println(postedPattern(n,h,w));
    }
    public static int postedPattern(int n,int h,int w){
        return (n - h + 1) * (n - w + 1); 
    }
}