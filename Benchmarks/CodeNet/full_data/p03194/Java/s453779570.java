import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long p = sc.nextLong();
        sc.close();
        if(n == 1){
            System.out.println(p);
            return;
        }

        long s = (long)Math.pow(p,(long)(1/n)) + 1;
        long ans = 1;
        for(int i = 2; i <= s ; i++){
            //if(p % i == 0){
                long t = (long)Math.pow(i,n);
                if(p % t == 0){
                    ans = i;
                }
            //}
        }
        System.out.println(ans);
    }
}