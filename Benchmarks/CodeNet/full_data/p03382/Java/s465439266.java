import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Santa on 2016/10/16.
 */
public class Main {

    static int A;
    static int B;
    static int C;
    static class pair {
            public int a;
            public int b;

            pair(){
                this.a = 0;
                this.b = 0;
            }

            pair(int a, int b){
                this.a = a;
                this.b = b;
            }

            public void set(int a, int b) {
                this.a = a;
                this.b = b;
            }
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        A = scanner.nextInt();

        int[] map = new int[A];


        for (int i = 0; i < A; i++) {
            map[i] = scanner.nextInt();
        }

        Arrays.sort(map);
        int max = -99;

        pair ans = null;
        for (int i = 0; i < A; i++) {
            for (int j = 0; map[j] < map[i]; j++) {
                if(max < map[i] - map[j] && max < map[j]){
                    ans = new pair(map[i], map[j]);
                    max = Math.min(map[j],map[i] - map[j]);
                }
            }
        }

        System.out.println(ans.a + " " + ans.b);



    }





}

