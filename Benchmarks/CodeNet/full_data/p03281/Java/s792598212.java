import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int[] num = new int[(N / 2) + 1];   //Nまでの奇数の分だけ配列を宣言
    int count = 2;                      //1とNが約数であるのは自明
    int ans = 0;
    
    for(int i = 0; i < (N / 2) + 1; i++){
        num[i] = 2 * i + 1;
    }
    
    for(int i = 0; i < ( N / 2 ) + 1; i++){
        for(int j = 2; j < N / 2; j++){
            if((num[i] % j) == 0){
                count++;
                if(count == 8){
                    ans++;
                }
            }
        }
    }    
        System.out.println(ans);
    }
}
