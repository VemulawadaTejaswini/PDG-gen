import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long N = scan.nextLong();
        if(N<10)System.out.println(N);
        else{
            int ans = 0;
            boolean all = true;
            while(N>0){

                if(N<10)ans += N-1;
                else{
                    all &= (N%10==9);
                    ans += 9;
                }
                N/=10;
            }
            if(all)++ans;
            System.out.println(ans);
        }
    }
}