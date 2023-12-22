
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

    static int[] height;
    static int[] minPossible;
    static int size;

    public static void main(String[] args) throws IOException {

        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        String[] sz = inp.readLine().split(" ");
        size = Integer.parseInt(sz[0]);
        int jump = Integer.parseInt(sz[1]);

        String[] given = inp.readLine().split(" ");
        height = new int[size];
        minPossible = new int[size];

        for(int i=0;i<size;i++){
            height[i] = Integer.parseInt(given[i]);
        }


        ans(jump);
        System.out.println(minPossible[size-1]);



    }

    static void ans(int jump){

        minPossible[0] = 0;
        int minValue = 1147483647;

        for(int i=1;i<size;i++){

            minValue = 1147483647;

            for (int j=1;j<=jump;j++){
                if(i-j>=0) {
                    int a = height[i];
                    int b = height[i - j];

                    int c = a - b;
                    if(c<0){
                        c = -c;
                    }

                    //System.out.println("c"+c);

                    int d = minPossible[i - j];
                    int value = d + c;

                    if (value < minValue) {
                        minValue = value;
                    }
                }
            }

            minPossible[i] = minValue;
        }
    }
}
