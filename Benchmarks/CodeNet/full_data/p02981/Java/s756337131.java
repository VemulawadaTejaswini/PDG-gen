
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner myScanner = new Scanner(System.in);
        int L = myScanner.nextInt();
        int R = myScanner.nextInt();
        int i = myScanner.nextInt();
        int j = myScanner.nextInt();

        if(L == i && R == j) System.out.println(i * j);
        else{
            System.out.println((i*j) % 2019);

        }
    }
}
