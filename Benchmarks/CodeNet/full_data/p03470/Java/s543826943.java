import java.util.HashSet;
import java.util.Scanner;

class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        HashSet<Integer> d = new HashSet<Integer>();

        for ( int i = 0; i < N; i++ ){
            d.add(sc.nextInt());
        }
        System.out.println(d.size());
    }
}