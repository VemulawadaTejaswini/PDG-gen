import java.util.*;

class Main{
    final static long mod = 1000000007;
    //
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt() % 2019;
        int r = sc.nextInt() % 2019;
        int min = 2018;
        if(l > r){int cur = l; l = r; r = cur;}
        for(int i = l; i <= r; i++){
            for(int j = i + 1; j <= r; j++){
                min = Math.min(min, i * j % 2019);
            }
        }
        System.out.println(min);

    }
}