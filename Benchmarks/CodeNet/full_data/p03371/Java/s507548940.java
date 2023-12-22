import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ab = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int aCount = 0;
        int bCount = 0;
        int abCount = 0;
        if(a + b <= ab * 2){
            aCount = x;
            bCount = y;
        }
        else{
            if(x > y){
                int k = x - y;
                abCount = y * 2;
                if(ab * 2 < a){
                    abCount += k * 2;
                }
                else aCount += k;
            }
            else{
                int k = y - x;
                abCount = x * 2;
                if(ab * 2 < b){
                    abCount += k * 2;
                }
                else bCount += k;
            }
        }
        System.out.println(aCount * a + bCount * b + ab * abCount);
    }
}