import java.util.Scanner;
import java.util.ArrayList;

public class Main{

    static Long memo[];
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        int N = Integer.parseInt(scan.next());
        int M = Integer.parseInt(scan.next());
        ArrayList<Integer> E = new ArrayList<Integer>();

        for(int i=0;i<M;i++)
            E.add(Integer.parseInt(scan.next()));

        memo = new Long[N+1];
        for(int i=0;i<N+1;i++) memo[i] = 0L;


        System.out.println(getConbination(N, E) % 1000000007L);
    }

    static Long getConbination(Integer N,ArrayList E){

        if(memo[N-1] != 0)
            return memo[N-1];

        if(N == 1){
            if(E.indexOf(1) == -1){
                memo[0] = 1L;
                return 1L;
            }else{
                memo[0] = 0L;
                return 0L;
            }
        }else if(N == 2){
            if(E.indexOf(1) == -1){
                memo[1] = 2L;
                return 2L;
            }else{
                memo[1] = 1L;
                return 1L;
            }
        }

        if(E.indexOf(N-1) != -1 && E.indexOf(N-2) != -1){
            return 0L;
        }else if(E.indexOf(N-1) != -1){
            return getConbination(N-2, E);
        }else if(E.indexOf(N-2) != -1){
            return getConbination(N-1, E);
        }else{
            Long memo_ = getConbination(N-1, E) + getConbination(N-2, E);
            memo[N-1] = memo_;
            return memo_;
        }
    }
}