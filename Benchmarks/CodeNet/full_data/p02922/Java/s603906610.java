import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),b = sc.nextInt();
        int count = 1;
        int ans = 0;
        while(count<b){
            ans ++;
            count += (a-1);
        }
        System.out.println(ans);
    }
}