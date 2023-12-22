import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] a = new long[N];
        int i = 0;
        long sum = 0;
        //ここで部分和を保持する
        //後で和を作りたいときはその差を用いて算出する
        while(i < N){
            a[i] = sc.nextInt();
            sum += a[i];
            i++;
        }
        int count = N;
        long memo_xor = a[0];
        long memo_sum = a[0];
        long len = 0;
        for (int j = 0; j < N; j++) {
//            System.out.println("a:" + a[j]);
//            System.out.println("6");
//            System.out.println("memo_xor:" + memo_xor);
//            System.out.println("memo_sum:" + memo_sum);
//            System.out.println("len:" + len);
//            System.out.println("count:" + count);
            if((int)len > 0) {
                len--;
            }
//            System.out.println("7");
//            System.out.println("memo_xor:" + memo_xor);
//            System.out.println("memo_sum:" + memo_sum);
//            System.out.println("len:" + len);
//            System.out.println("count:" + count);
            for (int k = (int)len + 1; k < N - j; k++) {
//                System.out.println("1");
//                System.out.println("memo_xor:" + memo_xor);
//                System.out.println("memo_sum:" + memo_sum);
//                System.out.println("len:" + len);
                memo_xor = memo_xor ^ a[j + k];
                memo_sum = memo_sum + a[j + k];
//                System.out.println("2");
//                System.out.println("memo_xor:" + memo_xor);
//                System.out.println("memo_sum:" + memo_sum);
//                System.out.println("len:" + len);
                if(memo_sum == memo_xor){
                    len++;
//                    System.out.println("3");
//                    System.out.println("memo_xor:" + memo_xor);
//                    System.out.println("memo_sum:" + memo_sum);
//                    System.out.println("len:" + len);
                }else{
                    if(k == 1){
                        memo_xor = a[j + k];
                        memo_sum = a[j + k];
                    }else{
                        memo_xor = memo_xor ^ a[j + k] ^ a[j];
                        memo_sum = memo_sum - a[j + k] - a[j];
                    }
//                    System.out.println("4");
//                    System.out.println("memo_xor:" + memo_xor);
//                    System.out.println("memo_sum:" + memo_sum);
//                    System.out.println("len:" + len);
                    break;
                }
            }
            count += len;
//            System.out.println("5");
//            System.out.println("memo_xor:" + memo_xor);
//            System.out.println("memo_sum:" + memo_sum);
//            System.out.println("len:" + len);
//            System.out.println("count:" + count);
        }
        System.out.println(count);
    }
}
