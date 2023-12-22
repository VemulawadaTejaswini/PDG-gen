import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();

        int d = Math.abs(String.valueOf(n).length() - String.valueOf(k).length());
        if(d>2){
            if(n > k){
                n = n/(int)Math.pow(10, d-1);
            }
            else{
                k = k/(int)Math.pow(10, d-1);
            }
        }

        long diff = 1000000000000000000L;
        while(true){
            long tmp = Math.abs(n-k);
            if(tmp < diff){
                diff = tmp;
                n = tmp;
            }
            else{
                break;
            }
        }

        System.out.println(diff);
    }
}
