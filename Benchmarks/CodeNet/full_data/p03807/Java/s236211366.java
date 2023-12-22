import java.util.Scanner;
import java.util.stream.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        System.out.println((IntStream.range(0,N).map(i -> scan.nextInt()).map(i -> i%2).sum()%2 == 0 ? "YES":"NO"));
    }
}