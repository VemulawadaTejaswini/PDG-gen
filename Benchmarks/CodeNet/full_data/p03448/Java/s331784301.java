import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int X = sc.nextInt();
        for(int i = 0; i <= A; i++){
            for(int j = 0; j <= B; j++){
                for(int k = 0; k <= C; k++){
                    if((500*i) + (100*j) + (50*k) == X){
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
