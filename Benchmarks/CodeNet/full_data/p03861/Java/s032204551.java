import java.util.Scanner;

/**
 * @Author oreid
 * @Release 04/12/2016
 */
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b =  scanner.nextLong();
        long x =  scanner.nextLong();
        long cnt = 0;
        scanner.close();


        cnt = numDivs(a ,b ,x);


        System.out.print(cnt);

    }

    public static long numDivs(long a, long b, long x) {
        long fDiv = a%x == 0 ? a : a + (x - a%x);
        long lDiv = b%x == 0 ? b : b - b%x;
        return (lDiv - fDiv)/x + 1;
    }
}
