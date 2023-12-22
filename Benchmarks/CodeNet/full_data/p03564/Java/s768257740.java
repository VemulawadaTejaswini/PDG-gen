import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int cur = 1;
        while(N>0){
            if(cur+K<2*cur) cur += K;
            else cur = cur*2;
            N--;
        }
        int ans = cur;
        System.out.println(ans);
    }
}