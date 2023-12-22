import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Frog {

    static int[] height;
    static int[] minHeight;

    static void min(int i){
        if(i==0){
            minHeight[0] = 0;

        }
        else if(i==1){
            int a = height[0];
            int b = height[1];
            int c = a-b;
            if(c<0){
                c = -c;
            }
            minHeight[1] = c;
        }
        else {
            int d = height[i];
            int a = height[i - 1];
            int b = height[i - 2];

            a = a - d;
            b = b - d;

            if (a < 0) {
                a = -a;
            }
            if (b < 0) {
                b = -b;
            }

            a = minHeight[i-1] + a;
            b = minHeight[i-2] + b;

            int c = a;
            if (a > b) {
                c = b;
            }
            minHeight[i] = c;
        }
    }
    public static void main(String[] args) throws IOException {

        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        String sz = inp.readLine();
        int size = Integer.parseInt(sz);

        String[] given = inp.readLine().split(" ");
        height = new int[size];
        minHeight = new int[size];

        for(int i=0;i<size;i++){
            height[i] = Integer.parseInt(given[i]);
        }

        int ans = 0;

        for (int i=0;i<size;i++){
             min(i);
        }

        System.out.println(minHeight[size-1]);


    }
}
