import java.util.*;

public class AtCoder {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String[] Str = scan.nextLine().split("");
        Integer[] S = new Integer[Str.length];

        for(int i=0; i<S.length; i++) {
            S[i] = Integer.parseInt(Str[i]);
        }

        int answer = 999;
        int absolute;
        for(int j=0; j<S.length-2; j++) {
            absolute = Math.abs(753 - (S[j]*100 + S[j+1]*10 + S[j+2]));
           if (absolute < answer) answer = absolute;
        }

        System.out.println(answer);
    }
}
