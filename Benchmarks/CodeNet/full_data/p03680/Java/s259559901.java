import javax.swing.*;
import java.util.*;



/**
 * Created by santa on 2016/10/16.
 */

public class Main {


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

        int N = scanner.nextInt();


        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = scanner.nextInt() - 1;
        }

        int[] list = new int[N];
        int next = 0;
        int c = 1;
        int flag = 0;
        while(true){
            if(a[next] == 1){
                flag = c;
                break;
            }
            next = a[next];
            if(list[next] == 1){
                flag = -1;
                break;
            }
            list[next] = 1;
            c++;
        }

        System.out.println(flag);



    }




} // MainClass
