import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {
        rdcstctn.Reader in = new rdcstctn.Reader();
        long n = in.nextLong();

        long[] moves = new long[5];
        long minPplPM = Long.MAX_VALUE;
        for (int i = 0; i < moves.length; i++){
            moves[i] = in.nextLong();
            minPplPM = Math.min(minPplPM, moves[i]);
        }
        System.out.println(5 + n / minPplPM);
    }
}
