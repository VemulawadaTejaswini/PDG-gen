import java.util.*;

class Main{
    static int Palindromic(int n){
        int ans;
        int[] t = new int[5];
        for(int i = 0; i < 5; i++){
            t[i] =  n % 10;
            n /= 10;
        }
        ans = 10000 * t[0] + 1000 * t[1] + 100 * t[2] + 10* t[3] + t[4];
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int count = 0;
        for(int i = A; i <= B; i++){
            if(i == Palindromic(i)) count++;
        }

        System.out.println(count);
    }
}