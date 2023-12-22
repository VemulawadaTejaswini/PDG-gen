import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = Math.max(a, b);
        int c = sc.nextInt();
        max = Math.max(max, c);
        int ans = 0;
        int diff = 0;
        if(a < max){
            ans += (max -a)/2;
            diff += (max -a)%2;
        }
        if(b < max){
            ans += (max -b)/2;
            diff += (max -b)%2;
        }
        if(c < max){
            ans += (max -c)/2;
            diff += (max -c)%2;
        }
        if(diff == 1) ans += 2;
        else if(diff == 2) ans += 1;
        System.out.println(ans);
        sc.close();

    }

}
