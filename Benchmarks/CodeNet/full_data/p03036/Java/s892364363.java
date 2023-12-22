import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int D;
    static int r;
    static int result;
    public static void main(final String[] args) throws NumberFormatException, IOException {

        String[] input = br.readLine().split(" ");
        r = Integer.parseInt(input[0]);
        D = Integer.parseInt(input[1]);
        int xi = Integer.parseInt(input[2]);

        for (int i = 1; i <=10; i++){
            xi = algaeDev(xi);
            System.out.println(xi);

        }


    
    }

    public static int algaeDev(int xi){
        return r * xi - D;
    }

}