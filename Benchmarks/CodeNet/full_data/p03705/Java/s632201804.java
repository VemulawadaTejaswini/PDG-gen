import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int min = 0;
        int max = 0;
        for(int i = 0;i < n-2;i++){
            min += a;
            max += b;
        }
        int ans = 0;
        if(max - min > 0){
            ans = max - min + 1;
        }
        if(a > b){
            System.out.println(0);
            return;
        }
        if(a == b && n == 1){
            System.out.println(1);
            return;
        }
        System.out.println(ans);
    }
}
