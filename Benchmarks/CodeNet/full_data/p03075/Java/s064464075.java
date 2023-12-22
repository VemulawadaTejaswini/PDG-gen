import java.io.*;
import java.util.Arrays;

public class Main {
    private static int[] pos = new int[5];
    private static int k;

    private static String solver() {
        int min = Arrays.stream(pos).min().getAsInt();
        int max = Arrays.stream(pos).max().getAsInt();
        if(k >= max - min){
            return "Yay!";
        }else{
            return ":(";
        }

    }


    public static void main(String[] args) {

        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        try {
            for(int i=0; i<5; i++) {
                String[] inputArray = br.readLine().split(" ");
                pos[i] = Integer.parseInt(inputArray[0]);
            }
            String[] inputArray = br.readLine().split(" ");
            k = Integer.parseInt(inputArray[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(solver());

    }
}