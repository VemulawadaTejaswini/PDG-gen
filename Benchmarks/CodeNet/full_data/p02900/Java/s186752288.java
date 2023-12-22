import java.util.Scanner;
import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.PriorityQueue;
class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        long a = stdIn.nextLong();
        long b = stdIn.nextLong();
        long x = gcd(a,b);

        int count = 0;

        ArrayList<Integer> s = new ArrayList<Integer>();

        // 0 - 100000までの素数を出力する
        int num = (int)Math.sqrt(x/2);
        // 高速バージョン
        if(x>7){
            num = (num - 3) / 2;
            int[] primeList = new int[num];
            for (int i = 0; i < num; i++) {
                primeList[i] = 1; // 1は素数扱いで管理する。（最初は全て素数として管理）
            }
            for (int i = 0; i < num; i++) {
                // primeList[i] == 0 の場合は素数ではないため演算しない
                if (primeList[i] == 1) {
                    int primeNum = i + i + 3;
                    // 遅くなるのでコメントアウト
                    s.add(primeNum);
                    count++;
                    // 素数と判定した場合、素数を計算対象範囲（num)になるまで
                    // 足しあげていき、素数ではない数値として判断する
                    // これを行うことで、例えば、 3, 6, 9, 12 ... num
                    // の数値に対して余分な演算を行わないようにしている
                    for (int j = i + primeNum; j < num; j += primeNum) {
                        primeList[j] = 0;
                    }
                }
            }

            for(long i = 2;i <= x/2;i++){
                if(x%i==0){
                    int check = 0;
                    int j = 0;
                    while(s.get(j) <= i){
                        if(i%s.get(j)==0){
                            check = 1;
                            break;
                        }
                        if(s.size()-1==j){
                            break;
                        }
                        j++;
                    }
                    if(check == 0){
                        count++;
                    }
                
                }
            }
        }

        count-=3;
        if(x==1){
            count=0;
        }else if(x==2||x==3||x==4||x==5||x==7){
            count=1;
        }else if(x==6){
            count=2;
        }

        if(isPrime(x)){
            count++;
        }
        

        count++;

        System.out.println(count);
    }

    static long gcd (long a, long b) {
        long temp;
        while((temp = a%b)!=0) {
            a = b;
            b = temp;
        }
        return b;
    }

    static boolean isPrime(long n)
    {
        if(n == 1){
            return false;
        }
        for(long i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

}