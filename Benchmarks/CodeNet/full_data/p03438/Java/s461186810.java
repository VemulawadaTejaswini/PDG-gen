import java.util.Scanner;
import java.util.stream.IntStream;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] a = IntStream.range(0,N).map(i->scan.nextInt()).toArray();
        int[] b = IntStream.range(0,N).map(i->scan.nextInt()).toArray();
        int rev = 0;
        int need=0;
        for(int i=0;i<N;++i){
            if(b[i]>a[i])rev += (b[i]-a[i])/2;
            if(a[i]>b[i])need += (a[i]-b[i]);
        }
        System.out.println((rev>=need ? "No":"Yes"));
    }
}