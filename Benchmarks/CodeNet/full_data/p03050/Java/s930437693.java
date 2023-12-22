import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum=0;
        long sav=0;
        for (long i = 1;i<=n;i++){
            long sho = n/i;
            long amari =n%i;
            if(sho==amari) {
                sum = sum + i;
                //System.out.println(i+" "+sho);
                sav = i;
                break;
            }

        }
        while(sav<=n){
            sum = sum + (sav*2+1);
            sav=sav*2+1;
        }
        System.out.println(sum);
    }
}
