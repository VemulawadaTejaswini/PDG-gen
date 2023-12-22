import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = -1;
        for(int i = 1;i <= 1000000000;i++){
            int x = Math.abs(a-i);
            int y = Math.abs(b-i);
            if(x == y){
                ans = i;
                break;
            }
        }

        System.out.println(ans != -1?ans:"IMPOSSIBLE");
    }
}