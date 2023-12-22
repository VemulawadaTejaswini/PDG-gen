import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int re1_left = a;
        int re1_right = a + W;
        int re2_left = b;
        int re2_right = b + W;

        int flag = 1;
        for(int i = re1_left; i <= re1_right;i++){
            if(i == re2_left || i == re2_right){
                System.out.println("0");
                flag = 0;
            }
        }
        if(flag == 1){
            int distance1 = re1_left - re2_right;
            int distance2 = re1_right - re2_left;
            if(distance1 < 0){
                distance1 = distance1 * (-1);
            }
            if(distance2 < 0){
                distance2 = distance2 * (-1);
            }
            if(distance1 > distance2){
                System.out.println(distance2);
            }else{
                System.out.println(distance1);
            }
        }
    }
}