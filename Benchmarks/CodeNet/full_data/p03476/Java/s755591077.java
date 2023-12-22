
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        int Q = Integer.parseInt(br.readLine().trim());
        int[][] lr = new int[Q][2];
        Boolean[] isPrime = new Boolean[100001];
        for(int i=0; i<lr.length; i++){
            lr[i] = inputval();
        }
        for(int i=0; i<isPrime.length; i++){
            isPrime[i] = true;
        }
        int x;
        for(int i=2; i<(int)Math.sqrt(isPrime.length); i++){
            x = 2;
            while(i*x < isPrime.length){
                isPrime[i*x] = false;
                x++;
            }
        }
        int count;
        for(int i=0; i<lr.length; i++){
            count = 0;
            for(int j=lr[i][0]; j<=lr[i][1]; j++){
                if(isPrime[j] && isPrime[(j+1)/2]) count++;
            }
            System.out.println(count);
        }
    }


    static int[] inputval() throws Exception {
        String[] strarray = br.readLine().trim().split(" ");
        int[] intarray = new int[strarray.length];
        for (int i = 0; i < intarray.length; i++) {
            intarray[i] = Integer.parseInt(strarray[i]);
        }
        return intarray;
    }

    static void array_sout(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void array_sout(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}