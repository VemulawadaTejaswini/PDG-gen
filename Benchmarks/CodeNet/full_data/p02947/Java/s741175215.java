import java.util.Scanner;
import java.util.HashMap;

public class Main{
    public static void main(String[] args){
        int i = 0;
        int j = 0;
        int ans = 0;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        byte[] flag = new byte[N];
        HashMap<Integer, char[]> chars = new HashMap<Integer, char[]>();

        for(i = 0; i < N; i++){
            chars.put(i, sc.next().toCharArray());
        }

        for(i = 0; i < N; i++){
            if(flag[i] == 1)    continue;
            else{
                for(j = i; j < N - 1; j++){
                    if(chars.get(i) == chars.get(j)){
                        ans++;
                    }
                }
            }
        }

        System.out.print(ans);
    }
}