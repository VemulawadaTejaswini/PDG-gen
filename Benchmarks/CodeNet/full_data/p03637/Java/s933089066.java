import java.util.*;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        IntStream.range(0,n).forEach(i ->
        {
            a[i] = sc.nextInt();
        });
        long count4 = Arrays.stream(a).filter(i -> { if( i%4==0){return true;}else{return false;}}).count();
        long count2 = Arrays.stream(a).filter(i -> { if( i%4!=0 && i%2==0){return true;}else{return false;}}).count();

        long N = (long)n;

        N = N-((count2/2)*2);
        N = N-(count4*2+1);
        if(N >= 1){
            System.out.print("No");
        }else{
            System.out.print("Yes");
        }

    }
}