import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] time = new int[5],
              wait = new int[5];
        int total = 0;
        for(int i = 0; i < 5; i++){
            time[i] = sc.nextInt();
            wait[i] = (10 - time[i]%10)%10;
            total += time[i] + wait[i];
        }
        int idx = maxIdx(wait);
        total -= wait[idx];                
        System.out.println(total);
    }
    public static int maxIdx(int[] wait){
        int idx = 0,
            data = wait[0];
        for(int i = 1; i < 5; i++){
            if(data < wait[i]){
                data = wait[i];
                idx = i;
            }
        }
        return idx;
    }
}