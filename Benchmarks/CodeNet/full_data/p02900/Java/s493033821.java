import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        long b = scan.nextLong();
        long c = 1;
        int count = 1;
        if(a % b != 0 && b % a != 0) {
            if (a > b) {
                while (a % b != 0) {
                    c = a % b;
                    a = b;
                    b = c;
                }
            } else {
                while (b % a != 0) {
                    c = b % a;
                    b = a;
                    a = c;
                }
            }
        }else{
            if(a > b){
                c = b;
            }else{
                c = a;
            }
        }
        if(c % 2 == 0){
            count += 1;
            while(c % 2 == 0){
                c = c / 2;
            }
        }
        for(long i = 3; i <= c; i += 2){
            if(i % 10 == 5 && i != 5){
                continue;
            }
            if(c % i == 0){
                count += 1;
                while(c % i == 0){
                    c = c / i;
                }
            }System.out.println(i);
        }
        System.out.println(count);
    }
}
