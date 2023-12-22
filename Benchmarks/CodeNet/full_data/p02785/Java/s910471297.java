import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.LongStream;

public class Main {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        long [] healths=new long[N];
        int sum_of_moves=0;
        for(int i=0;i<N;i++)
           healths[i]=sc.nextLong();
        Arrays.sort(healths);
      //  String output=(sum_of_moves>=H)?"Yes":"No";
        System.out.print((N>K)? LongStream.of(Arrays.copyOfRange(healths,0,healths.length-K)).sum():0);
    }
}