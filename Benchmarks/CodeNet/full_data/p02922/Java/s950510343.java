import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        final int A = scan.nextInt();
        final int B = scan.nextInt();
        int result = 0;
        result = (B - A) / (A - 1) + 1;
        if((B - A) % (A - 1) >= 1){
            result++;
        }
        System.out.println(result);
        scan.close();
    }
    
}