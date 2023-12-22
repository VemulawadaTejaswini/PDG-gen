
import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] P = new int[M];
        String[] result = new String[M];

        for(int i=0; i<M; i++){
            P[i] = sc.nextInt();
            result[i] = sc.next();
        }

        int countAC = 0;
        int countPena = 0;
        int clearFlg = 0;
        for(int i=0; i < M; i++){
            if(i == 0){
                if(result[i].equals("AC")){
                    countAC += 1;
                    clearFlg = 1;
                }else if(result[i].equals("WA")){
                    countPena +=1;
                }
            }else if(P[i] == P[i-1]){
                if(result[i].equals("AC") && clearFlg == 0){
                    countAC += 1;
                    clearFlg = 1;
                }else if(clearFlg == 0 && result[i].equals("WA")){
                    countPena +=1;
                }
            }else{
                clearFlg = 0;
                if(result[i].equals("AC")){
                    countAC += 1;
                    clearFlg = 1;
                }else if(result[i].equals("WA")){
                    countPena +=1;
                }
            }
        }
        System.out.println(countAC+" "+countPena);
    }
}