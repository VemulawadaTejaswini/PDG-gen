import java.util.*;

public class Main{

    public static void main(String args[]){

        // スキャナーの宣言
        Scanner sc = new Scanner(System.in);
        // 整数の入力
		int n = sc.nextInt();
        // 配列の宣言
        int[] a = new int[n];
        int sum = 0;
        // for文
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            sum += a[i];
        }

        int[] answer = new int[n];
        //for(int i = 0; i < sum; i += 2){
            answer[0] = 0;
            int ans_sum = 0;
            for(int j = 1; j < n; j++){
                answer[j] = a[j - 1] * 2 - answer[j - 1];
                ans_sum += answer[j];
            }
            //if(ans_sum == sum) break;
        //}

        int o = sum - ans_sum;
        if(ans_sum != sum){
            answer[0] = o;
            ans_sum = answer[0];
            for(int j = 1; j < n; j++){
                if(j % 2 == 0) answer[j] += o;
                else answer[j] -= o;
                ans_sum += answer[j];
            }
        }

        String s = "";
        for(int i = 0; i < n; i++){
            s = s + answer[i] + " ";
        }

        // 出力
        System.out.println(s);

    }

}
