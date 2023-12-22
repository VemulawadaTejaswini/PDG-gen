import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] food = new int[5];
        food[0] = Integer.parseInt(sc.nextLine());
        food[1] = Integer.parseInt(sc.nextLine());
        food[2] = Integer.parseInt(sc.nextLine());
        food[3] = Integer.parseInt(sc.nextLine());
        food[4] = Integer.parseInt(sc.nextLine());
        int[] food2 = new int[5];
        System.arraycopy(food,0,food2,0,food.length);
        int num = 0;
        int sum = 0;
        num = calc(food2);
        int mod = 0;
        for(int i = 0;i < 5;i++){
            mod = food[i] % 10;
            if (mod != 0) {
                food[i] = food[i] + (10 -mod);
            }
            sum = sum + food[i];
        }
        System.out.println(sum-num);
    }
    public static int calc(int[] ary) {
        int num = 9;
        int flg = 0;
        ary[0] = ary[0] % 10;
        ary[1] = ary[1] % 10;
        ary[2] = ary[2] % 10;
        ary[3] = ary[3] % 10;
        ary[4] = ary[4] % 10;
        for (int i = 0;i < 4;i++){
            if (ary[i] != 0){
                num = Math.min(num,ary[i]);
                flg = 1;
            }
        }
        if (flg == 0) {
            return 0;
        } else {
            return 10-num;
        }
    }
}
