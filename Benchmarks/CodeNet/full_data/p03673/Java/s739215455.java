import java.util.*;



/**
 * Created by santa on 2016/10/16.
 */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] map = new int[N];
        int flag = 0;
        int migi = N - 1;
        int hidari = 0;
        flag = 0;
        int[] s = new int[N];
        for (int i = 0; i < N; i++) {
            s[i] = scanner.nextInt();
        }
        for (int i = N - 1 ; i >=  0; i--) {
            if(flag == 1){
                map[migi] = s[i];
                migi -= 1;
                flag = 0;
            }else{
                map[hidari] = s[i];
                hidari += 1;
                flag = 1;
            }
        }
        System.out.print(map[0]);
        for (int i = 1; i < N; i++) {
            System.out.print(" " + map[i]);
        }

        System.out.println();

    }






} // MainClass
