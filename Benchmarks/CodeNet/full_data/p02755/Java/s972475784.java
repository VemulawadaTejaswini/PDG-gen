import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = -1;
        for(int i = 10*b;i <= 1009;i++){
            if(a == i*8/100){
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}