import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] p = new int[M];
        String[] S = new String[M];
        boolean[] isCleared = new boolean[N];
        int AC = 0;
        int[] WA = new int[N];

        for (int i = 0; i < M; i++) {
            p[i] = sc.nextInt();
            S[i] = sc.next();
        }
        for (int i=0;i <N;i++) {
            isCleared[i] = false;
        }

        for(int i= 0; i< M;i++){
            if(S[i].equals("AC") && !isCleared[p[i]-1]){
                AC++;
                isCleared[p[i]-1] = true;
            } else if(S[i].equals("WA") && !isCleared[p[i]-1]){
                WA[p[i] -1]++;
            }
        }
        int WAinAC = 0;
        for(int i=0;i <N;i++){
            if(isCleared[i]){
                WAinAC+= WA[i];
            }
        }

        System.out.println(AC + " "+ WAinAC);
    }
}
