import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int t[] = new int[n];

        for(int i = 0; i < n; i++){
          t[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int p=0; //ドリンクの効果が表れる番目
        int x=0; //ドリンクを飲んだ時何秒になるか
        for(int j = 0; j < m; j++){
          p = sc.nextInt();
          x = sc.nextInt();
           t[p] = x;
           for(int k = 0; k < n; k++){
             sum += t[k];
           }
           System.out.println(sum);
           sum = 0;
        }
    }
}
