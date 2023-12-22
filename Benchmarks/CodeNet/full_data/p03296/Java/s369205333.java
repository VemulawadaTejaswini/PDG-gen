

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        PrintWriter out = new PrintWriter(System.out);
        Scanner sc = new Scanner(System.in);
        Task task = new Task();
        task.solve(sc, out);
        out.flush();
        sc.close();
    }
    static class Task{
        public void solve(Scanner sc, PrintWriter out){
            int N = nint(sc);
            int[] ai = intLine(sc, N);
            int left;
            int right;
            int rightright ;
            int changeCount = 0;
            for (int i=1; i<N-1; i++){
                right = ai[i+1];
                if (i ==1) {
                    left = ai[i-1];
                    if (left == ai[i] &&  ai[i] != right ) {
                        
                        changeCount++;
                    }else if(left != ai[i] &&  ai[i] == right){
                       
                        rightright = ai[i+2];
                        if (right == rightright){
                            i ++;
                        }
                        changeCount++;
                    }else if (left == ai[i]  && ai[i] == right){
                        changeCount++;
                    }
                } else if (i == N-2){
                    if(ai[i] == ai[i+1] ){
                        changeCount++;
                    }
                } else if(ai[i] == right){
                    rightright = ai[i+2];
                    if (right == rightright){
                        i ++;
                    }
                    changeCount++;
                }
            }
            out.println(changeCount);

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