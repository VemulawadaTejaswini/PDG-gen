import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {
    /**
     * Iterate through each line of input.
     */

    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    void run(){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int[N];

        for(int i=0; i<N; i++){
            array[i] = sc.nextInt();
        }

        int count = 1;
        int next = 0;
if(array[0] == 2) System.out.println(1);
else{
        while(true){
            count++;
            next = array[next]-1;
            if(array[next] == 2){
                System.out.println(count);
                break;
            }

            if(count >= N){
                System.out.println(-1);
                break;
            }
        }
    }
}

}
