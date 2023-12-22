import java.util.*;

public class Main{
    static void solve(long high,long middle,long low,long k){
        long d = 10;
        for(int i=0;i<17;i++){
            d=10*d;
        }
        if((high-middle)>d){
            System.out.println("Unfair");
        }else{
            if(k%2==0){
            System.out.println(high-middle);
            }else{
                System.out.println(middle-high);
            }
        }
    }
    public static void main(String[]args){
        Scanner std = new Scanner(System.in);
        long high=std.nextLong();
        long middle=std.nextLong();
        long low = std.nextLong();
        long k=std.nextLong();
        solve(high, middle, low, k);

    }
}