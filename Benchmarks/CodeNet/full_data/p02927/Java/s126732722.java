import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int M = Integer.parseInt(sc.next());
        int D = Integer.parseInt(sc.next());
        int answer=0;
        for(int i = 1; i < M+1; i++){
            for(int j = 22; j < D+1; j++){
                if((j/10 * (j-j/10*10)) == i && (j-j/10*10) >= 2){
                    answer++;
                }
            }
        }
        System.out.println(answer);

    }
    }