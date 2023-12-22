import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = Math.max(a,Math.max(b,c));
        int sum = a + b + c;
        int count = (max * 3 - sum) / 2;
        if((max * 3 - sum) % 2 == 1){
            count += 1;
        }

        System.out.println(count);
    }
}