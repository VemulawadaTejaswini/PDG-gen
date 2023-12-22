import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        String[] str = stdR.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);
        
        int[] st = new int[M];
        int[] en = new int[M];
        for(int i = 0 ; i < M ; i++){
            str = stdR.readLine().split(" ");
            st[i] = Integer.parseInt(str[0]) - 1;
            en[i] = Integer.parseInt(str[1]) - 1;
        }
        
        int[] number = new int[N];
        int[] rank = new int[N];
        for(int i = 0 ; i < N ; i++){
            number[i] = i;
        }
        
        for(int i = 0 ; i < M ; i++){
            int a = numberuni(number, st[i]);
            int b = numberuni(number, en[i]);
            if(a == b)continue;
            if(rank[a] < rank[b]){
                number[a] = b;
            }else{
                number[b] = a;
                if(rank[a] == rank[b])rank[a]++;
            }
        }
        
        int count = 0;
        for(int i = 0 ; i < N ; i++){
            if(number[i] == i){
                count++;
            }
        }
        System.out.println(count);
    }
    
    public static int numberuni(int[] nums,int x){
        if(nums[x] == x){
            return x;
        }else{
            return numberuni(nums,nums[x]);
        }
    }
}
