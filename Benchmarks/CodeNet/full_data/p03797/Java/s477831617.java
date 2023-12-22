import java.util.Scanner;
import java.util.Set;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();

        int cnt = 0;
        while(n>0 && m>1){
            cnt++;
            n--;
            m-=2;
        }
        while(m>3){
            cnt++;
            m-=4;
        }
        System.out.println(cnt);
    }
}