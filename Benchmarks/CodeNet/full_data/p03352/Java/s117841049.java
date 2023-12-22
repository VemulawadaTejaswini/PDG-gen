import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        sc.close();
        int ans = 1;
        for(int i = 2; i < 32; i++){
            int tmp = 1;
            tmp *= i;
            while(tmp <= X){
                tmp *= i;
                if(tmp <= X) ans = Math.max(ans, tmp);
                else break;
            }
        }
        System.out.println(ans);

    }

}
