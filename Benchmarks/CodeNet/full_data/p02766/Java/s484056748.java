import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int tmp = n;
        int cnt = 0;

        while(tmp > 0){
            tmp /= k;
            cnt++;
        }

        System.out.println(cnt);
        
    }
}