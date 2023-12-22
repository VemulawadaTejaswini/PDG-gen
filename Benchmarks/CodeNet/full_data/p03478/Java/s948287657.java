import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int n = Integer.valueOf(sc.next());
        final int a = Integer.valueOf(sc.next());
        final int b = Integer.valueOf(sc.next());
        int count=0;
        int allDigits=0;
        for(int i=1; i<=n; i++){
            allDigits = sumAllDigits(i);
            count += (b >= allDigits && allDigits >= a)? i:0;
        }
        System.out.println(count);
        sc.close();
    }       

    public static int sumAllDigits(int num) {
        int result = 0;
        while(num >= 10) {
            result += num % 10;
            num = num/10;
        }
        return result + num;
    }
}