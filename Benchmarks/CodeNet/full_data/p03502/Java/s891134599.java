import java.util.*;

class Main{
    static int digitsum(int n){
        int sum = 0;
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if(N % digitsum(N) == 0) System.out.println("Yes");
        else System.out.println("No");
    }
}