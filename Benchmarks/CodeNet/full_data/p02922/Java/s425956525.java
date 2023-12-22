import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i = 0;
        int ans = 0;

        if(b != 1){
            for(i = 0;ans < b;i++){
                if(i == 0){
                    ans = a;
                }else{
                    ans += a-1;
                }
            }
            System.out.println(i);
        }else{
            System.out.println(0);
        }
    }
}