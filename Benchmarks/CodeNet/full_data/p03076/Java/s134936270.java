import java.util.*;
import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] time = new int[5];
        for(int i = 0; i < 5; i++){
            time[i] = scan.nextInt();
        }

        int[] time2 = new int[5];
        for(int i = 0; i < 5; i++){
            time2[i] = (int)ceil( (double)(time[i])/10.0 ) * 10;
        }


        int max = 0;
        int count = 0;
        int tmp =0;
        for(int i = 0; i < 5; i++){

            tmp = time2[i]-time[i];
            if(max <= tmp){
                max = tmp;
                count = i;
            }
        }

        int ans = 0;
        for(int i = 0; i < 5; i++) {

            if(i == count){

                ans += time[i];

            }else{

                ans += time2[i];
            }
        }

        System.out.println(ans);
    }
}