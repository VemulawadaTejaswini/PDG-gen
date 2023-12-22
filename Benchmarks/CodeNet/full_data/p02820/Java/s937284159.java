import java.util.*;

public class Main {
    public static void main(String[] args) {

        solve_149_D();
      
        return;
    }

    private static void solve_149_D() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] score = new int [N];
        int K = sc.nextInt();

        int R_point = sc.nextInt();
        int S_point = sc.nextInt();
        int P_point = sc.nextInt();

        String T = sc.next();
        String[] TArray = T.split("");

        for(int i=0; i<N; i++) score[i] = 0;

        if(TArray[0].equals("r")){
            score[0] = P_point;
        }else if(TArray[0].equals("s")){
            score[0] = R_point;
        }else {
            score[0] = S_point;
        }

        for(int i=1; i<N; i++){
            if( (i-K)<0 ){
                if(TArray[i].equals("r")){
                    score[i] = score[i-1]+P_point;
                }else if(TArray[i].equals("s")){
                    score[i] = score[i-1]+R_point;
                }else {
                    score[i] = score[i-1]+S_point;
                }
            }else{
                if((TArray[i-K].equals(TArray[i])) && ((i-K)==0)  ){
                    score[i] = score[i-1]+0;
                }else if((TArray[i-K].equals(TArray[i])) && (score[i-K]!=score[i-K-1])  ){
                    score[i] = score[i-1]+0;
                }else{
                    if(TArray[i].equals("r")){
                        score[i] = score[i-1]+P_point;
                    }else if(TArray[i].equals("s")){
                        score[i] = score[i-1]+R_point;
                    }else {
                        score[i] = score[i-1]+S_point;
                    }
                }
            }
        }
        System.out.println(score[N-1]);
    }
}