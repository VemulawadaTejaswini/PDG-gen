import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        int[] ary = new int[nums];
        boolean flg = true;
        int cnt = 0;
        for(int i = 0; i < nums; i++){
            ary[i] = sc.nextInt();
        }
        while(flg == true){
            for(int i : ary){
                if(i % 2 == 0){
                    i = i / 2;
                }else{
                    flg = false;
                }
            }
            if(flg == true) cnt++;
        }
        System.out.println(cnt);
    }
}
