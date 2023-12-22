import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int d = IntStream.range(0,N).map(i -> scan.nextInt()).toArray();
        Arrays.sort(d);
        int ans = 1;
        for(int i= 0;i<N-1;++i){
            if(d[i+1] > d[i])++ans;
        }
        System.out.println(ans);
    }
}