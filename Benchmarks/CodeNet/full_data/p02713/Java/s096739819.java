
import java.util.Scanner;

public class Main {

    static int[] prime = {2,3,5,7,11,13,
            17,19,23,29,31,
            37,41,43,47,53,
            59,61,67,71,73,
            79,83,89,97};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        long ans = 0;
        for(int a=0;a<k;a++){
            for(int b=0;b<k;b++){
                for(int c=0;c<k;c++){
                    if(a == b && a == c){
                        ans += a+1;
                        continue;
                    }
                    int A = a+1, B = b+1, C = c+1, gcd = 1;
                    for(int x=0,y=prime.length;x<y;x++){
                        if(A%prime[x] != 0 || B%prime[x] != 0 || C%prime[x] != 0){  //割り切れないなら次の素数へ
                            continue;
                        }else{
                            gcd *= prime[x];
                            A /= prime[x];
                            B /= prime[x];
                            C /= prime[x];
                            x--;    //同じ素数でもう一度試す
                        }
                    }
                    ans += gcd;
                }
            }
        }
        System.out.println(ans);
    }
}
