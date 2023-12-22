import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int ans = x / 2 + 1;
        while(true){
            int tmp = ans;
            tmp--;
            if(tmp * (tmp + 1) / 2 < x) break;
            ans = tmp;
        }

        System.out.println(ans);
        sc.close();
    }

}
