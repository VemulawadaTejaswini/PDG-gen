import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int count = 0;
        for(int i = 1; i <= N; i++){
            for(int j = i; j <= N; j++){
                for(int k = j; k <= N; k++){
                    int a = i;
                    int b = j;
                    int c = k;
                    if(((a+b)%K == 0 && (b+c)%K == 0) && (a+c)%K == 0){
                        if((a == b && b == c) && c == a){
                            count ++;
                        }else if((a == b || b == c) || c == a){
                            count += 3;
                        }else{
                            count += 6;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
