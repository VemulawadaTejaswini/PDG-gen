import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        boolean debug = false;
        if (debug != false) {
            return;
        }
        System.out.println(str);
    }

    public static void main(String[] args) {

        long S;

        try (Scanner sc = new Scanner(System.in)) {
            S = sc.nextLong();
        }
        long tes = (long) Math.sqrt(S) + 1;
        long X1 = 0L;
        long Y1 = 1L;
        long X2 = 0L;
        long Y2 = 0L;

        if(tes*tes - S > 1000000000){
            X1 = tes -1;
            Y2 = tes -1;
            X2 = S -(X1 *Y2);
        }else{
            X1 = tes;
            Y2 = tes;
            X2 = (X1 *Y2) - S;
        }




        StringBuilder sb = new StringBuilder();
        sb.append("0 0 ").append(X1).append(" ").append(Y1).append(" ");
        sb.append(X2).append(" ").append(Y2);
        System.out.println(sb.toString());
        return;
    }



}
