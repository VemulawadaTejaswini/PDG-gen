import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long k = scan.nextLong();
        scan.close();

        if(k == 1 || n == k) System.out.println("0");

        else if(k == 2){
            if(n % k == 0) System.out.println("0");
            else System.out.println("1");
        }

        else{
            while(true){
                if(n * 2 <= k) break;
                else if(Math.abs(n - k) > n) break;
                else if(n >= (long)Math.pow(k,2)) n = n % k;
                else n = Math.abs(n - k);
            }
            System.out.println(n);
        }
    }
}