import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int[] A = new int[S.length()];
        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i) == 'B'){
                A[i] = 1; //黒は1
            } else {
                A[i] = 0; //白は0
            }
        }
        int sum = sum(A);
        int ans = 0;
        while(sum != A.length && sum != 0){
            if(A[0] == 1){
                int i = 0;
                while(A[i] != 0){
                    A[i] = 0;
                    i++;
                }
            } else {
                int i = 0;
                while(A[i] != 1){
                    A[i] = 1;
                    i++;
                }
            }
            ans++;
            sum = sum(A);
        }
        System.out.println(ans);
    }
    
    public static int sum(int[] A){
        int sumNum = 0;
        for(int i: A){
            sumNum = sumNum + i;
        }
        return sumNum;
    }
}
