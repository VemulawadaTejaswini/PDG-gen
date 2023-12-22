import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();
        int i;
        long number = 0;
        for (i = 9; i >= 1; i--) {
            if(x < b*i)continue;
            number = (x - b * i) / a;
            if(number == 0) continue;
            long dig = String.valueOf(number).length();
            if (dig >= i)
                break;
        }
        if (i == 0) {
            System.out.println(i);
        } else {
            if(number > 1000000000){
                number = 1000000000;
            }
            System.out.println(number);
        }
    }
}
