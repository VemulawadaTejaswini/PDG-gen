import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long N = scan.nextLong();
        if(N<10)System.out.println(N);
        else{
            int ans = 0;
            while(N>0){
                if(N<10)ans += N-1;
                else ans += 9;
                N/=10;
            }
            System.out.println(ans);
        }
    }
}