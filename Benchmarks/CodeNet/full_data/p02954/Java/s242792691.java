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

        String S;

        try (Scanner sc = new Scanner(System.in)) {
            S = sc.next();
        }
        long[] Math = new long[S.length()];
        for (int i = 0; i < Math.length; i++) {
            Math[i] = 0;
        }
        boolean LR[] = new boolean[S.length()];
        for (int i = 0; i < LR.length; i++) {
            if (S.charAt(i) == 'L') {
                LR[i] = true;
            } else {
                LR[i] = false;
            }
        }
        //Rの個数
        long countR = 0;
        for(int i = 0; i < LR.length; i++){
            if(LR[i] == false){
                countR++;
            }else{
                Math[i] += countR /2;
                Math[i-1] += countR /2;
                if(countR % 2 ==1){
                    Math[i-1] += 1;
                }
                countR =0;
            }
        }
        //Lの個数
        long countL = 0;
        for(int i = 0; i < LR.length; i++){
            if(LR[(LR.length - i) -1] == true){
                countL++;
            }else{
                Math[(LR.length - i) -1] += countL /2;
                Math[(LR.length - i) -1+1] += countL /2;
                if(countL % 2 ==1){
                    Math[(LR.length - i) -1+1] += 1;
                }
                countL =0;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Math.length; i++) {
            long l = Math[i];
            sb.append(l).append(" ");
        }
        System.out.println(sb.toString());
        return;

    }
}
