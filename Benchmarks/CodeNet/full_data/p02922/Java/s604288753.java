import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a;
        int cnt=1;
        int sum2 = a-1;

        while(sum<b){
            sum += sum2;
            cnt++;
        }
        System.out.println(cnt);
    }
}
