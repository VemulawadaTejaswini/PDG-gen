import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        long x = scan.nextLong();
        long y = scan.nextLong();

        long i = x;
        long cnt = 1;
        while(i*2 <= y){
            i *= 2;
            cnt++;
        }
        System.out.println(cnt);
        scan.close();
        
    }
}