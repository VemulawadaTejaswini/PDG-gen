
import java.util.Scanner;

class Main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int K = in.nextInt();
        int X = in.nextInt();
        
        int MIN = -1000000;
        int MAX = 1000000;
        
        int min = MIN < X-K+1 ? X-K+1 : MIN;
        int max = MAX > X+K-1 ? X+K-1 : MAX;
        
        for(int i=min; i<=max; i++) {
            System.out.print(i+" ");
        }
    }
}