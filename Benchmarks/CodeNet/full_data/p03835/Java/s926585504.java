import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int s = sc.nextInt();
        int t[] = new int[k+1];
        int cnt = 0;
        for (int j = 0; j <= k; j++){
            t[j] = j;
        }
        for(int i = 0; i <= k; i++){
            for(int h = 0; h <= k; h++){
                for(int g = 0; g <= k; g++){
                    if(s == t[i] + t[h] + t[g]){
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}