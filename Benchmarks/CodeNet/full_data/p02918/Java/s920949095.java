import java.util.*;
import java.lang.*;


public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        String line = sc.next();

        int same=0, different=0;
        for(int n=0; n<N-1; n++){
            if(line.charAt(n)==line.charAt(n+1)) same++;
            else different++;
        }
        System.out.println(Math.min(N-1, same+2*K));
    }
}
