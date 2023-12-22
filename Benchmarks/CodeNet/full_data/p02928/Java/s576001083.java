import java.util.Scanner;

public class Main {

    public static class A {
        public int num;
        public int count = 0;
        public int beforeCount = 0;
        public A(){}
    }

    public static long siguma( long a ){
        long ans = 0 ;
        for( long i = 1 ; i <= a ; i++ ){
            ans += i;
        }
        return ans;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] params = in.nextLine().split(" ");
        int N = Integer.parseInt(params[0]);
        long K = Long.parseLong(params[1]);
        params = in.nextLine().split(" ");

        A[] As = new A[N];
        for( int i = 0 ; i < N ; i++ ){
            As[i] = new A();
            As[i].num = Integer.parseInt(params[i]);
        }

        int COUNT = 0 ;
        int BEFORE = 0;
        for( int i = 0 ; i < N ; i++ ){
            for( int j = 0 ; j < N ; j++ ){
                if( i == j ){
                    continue;
                }
                if(As[i].num > As[j].num){
                    COUNT++;
                    As[i].count++;
                    if( j < i ){
                        As[i].beforeCount++;
                        BEFORE++;
                    }
                }
            }
        }

        long count = 0;
        long s = siguma(K);
        count = COUNT * s;
        while( count / 1000000007 > 0 ){
            count -= 1000000007;
        }
        count -= BEFORE * K;
        while( count / 1000000007 < 0 ){
            count += 1000000007;
        }
        System.out.println(count%1000000007);

    }

}
