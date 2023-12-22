import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long t = 4;
        boolean istrue = false;
        long ans;
        for(long i=1;i<=3500;i++){
            for(long j=1;j<=3500;j++){
                if((t*i-n)*j - n*i>0) {
                    ans = (n * i * j) / ((t * i - n) * j - n * i);
                    if (ans > 0 && (n * i * j) % ((t * i - n) * j - n * i) == 0) {
                        System.out.println(i + " " + j + " " + ans);
                        istrue = true;
                        break;
                    }
                }

            }
            if(istrue == true) break;
        }

    }

}
