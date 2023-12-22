import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        PrintWriter out = new PrintWriter(System.out);
        Scanner sc = new Scanner(System.in);
        //TaskC task = new TaskC();
        int N = nint(sc);
        long[] lLine = longLine(sc, N);
        TaskC.solve(N, lLine, sc, out);
        out.flush();
        sc.close();
    }
    static class TaskC{
        static void solve(int N, long[] lLine, Scanner sc, PrintWriter out){
            long max = 0;
            for (long x: lLine){
                if (x >= max){
                    max = x;
                }
            }
            long biginNum = max - N;
            long firstResult = 0;
            for (int i = 1; i <= N; i++) {
                firstResult += Math.abs(lLine[i-1] - (biginNum+i));
            }

            long biginNum2 = N -max;
            long secondResult = 0;
            for (int i = 1; i <= N; i++) {
                secondResult += Math.abs(lLine[i-1] - (biginNum2+i));
            }

            if (firstResult >= secondResult){
                out.println(firstResult);
            }else{
                out.println(secondResult);
            }



//            }
//                long thirdResult=0;
//                int b3 =  biginNum -1;
//                for (int i = 1; i <= N; i++) {
//                    thirdResult += Math.abs(lLine[i-1] - (b3+i));
//                }
//                if (firstResult<=secondResult  && firstResult<=thirdResult){
//                    out.println(firstResult);
//                }else if(secondResult < firstResult){
//                    TaskC.solve(N, lLine, sc, out, b2);
//                }else if(thirdResult < firstResult) {
//                    TaskC.solve(N, lLine, sc, out, b3);
//                }
//            }else if(biginNum<0){
//                for (int i = 1; i <= N; i++) {
//                    firstResult += Math.abs(lLine[i-1] - (biginNum+i));
//                }
//                long secondResult=0;
//                int b2 =  biginNum - 1;
//                for (int i = 1; i <= N; i++) {
//                    secondResult += Math.abs(lLine[i-1] - (b2+i));
//                }
//
//                if (firstResult<=secondResult){
//                    out.println(firstResult);
//                }else{
//                    TaskC.solve(N, lLine, sc, out, b2);
//                }
//            }else {
//                for (int i = 1; i <= N; i++) {
//                    firstResult += Math.abs(lLine[i-1] - (biginNum+i));
//                }
//                long secondResult=0;
//                int b2 =  biginNum + 1;
//                for (int i = 1; i <= N; i++) {
//                    secondResult += Math.abs(lLine[i-1] - (b2+i));
//                }
//
//                if (firstResult<=secondResult){
//                    out.println(firstResult);
//                }else {
//                    TaskC.solve(N, lLine, sc, out, b2);
//                }
//            }
//

        }
    }
    static int nint(Scanner sc){
        return Integer.parseInt(sc.next());
    }
    static long nlong(Scanner sc){
        return Long.parseLong(sc.next());
    }
    static double ndouble(Scanner sc){
        return Double.parseDouble(sc.next());
    }
    static float nfloat(Scanner sc){
        return Float.parseFloat(sc.next());
    }
    static String nstr(Scanner sc){
        return  String.valueOf(sc.next());
    }
    static long[] longLine(Scanner sc, int size){
        long[] lLine = new long[size];
        for (int i = 0; i < size; i++) {
            lLine[i] = nlong(sc);
        }
        return lLine;
    }
    static int[] intLine(Scanner sc, int size){
        int[] iLine = new int[size];
        for (int i = 0; i < size; i++) {
            iLine[i] = nint(sc);
        }
        return iLine;
    }
    static String[] strLine(Scanner sc, int size){
        String[] strLine = new String[size];
        for (int i = 0; i < size; i++) {
            strLine[i] = nstr(sc);
        }
        return strLine;
    }
}