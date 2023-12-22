import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        long k = reader.nextLong();
        long[] a = new long[n];
        for(int i=0;i<n;++i){
            a[i] = reader.nextLong();
        }
        long max = 0;
        long candidate;
        for(long i=0;i<=k;++i){
            candidate = sumOfXOR(i, a);
            if(candidate>max)
                max=candidate;
        }
        System.out.println(max);
        reader.close();
    }
     private static long sumOfXOR(long x, long[] a){
        long sum = 0;
        for(long a_i:a){
            sum+=x^a_i;
        }
        return sum;
     }
}