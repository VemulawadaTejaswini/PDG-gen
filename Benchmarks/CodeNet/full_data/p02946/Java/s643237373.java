import java.io.PrintWriter;
import java.util.* ;

class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int K = in.nextInt();
        int X = in.nextInt();
        int start = X - K + 1;
        int end = X + K - 1;
        int pointer = start;
        while(pointer <= end) {
            pw.print(pointer+" ");
            pointer++ ;
        }
        pw.close();
    }
}