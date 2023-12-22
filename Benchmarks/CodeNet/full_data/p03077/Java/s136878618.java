import java.io.*;
import java.util.Arrays;

public class Main {
    private static long[] pos = new long[5];
    private static long member;

    private static long solver() {
        long min = Arrays.stream(pos).min().getAsLong();
        long rem = (member % min)>0 ? 1: 0;

        return 4 + member / min + rem;
    }


    public static void main(String[] args) {

        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        try {
            String[] inputArray = br.readLine().split(" ");
            member = Long.parseLong(inputArray[0]);
            for(int i=0; i<5; i++) {
                inputArray = br.readLine().split(" ");
                pos[i] = Long.parseLong(inputArray[0]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(solver());

    }
}