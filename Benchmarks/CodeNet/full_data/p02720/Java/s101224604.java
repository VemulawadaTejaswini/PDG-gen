import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        long num = 1;
        long now = 0;
        for(int i = 0; i < k; num++){
            now = num;
            while(true){
                if(now / 10 == 0){
                    i++;
                    //System.out.println(num);
                    break;
                }
                if(Math.abs(now % 10 - now % 100 / 10) > 1){
                    break;
                }else {
                    now /= 10;
                }
            }
        }
        System.out.println(--num);
    }
}
