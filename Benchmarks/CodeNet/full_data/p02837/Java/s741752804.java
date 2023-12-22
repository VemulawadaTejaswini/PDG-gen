import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[][] rumors = new int[n][n];     //言った人、言った先
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                rumors[i][j]=-1;
            }
        }
        
        int testimony_n =0, person = 0;
        for(int i = 0;i < n;i++){
            testimony_n = Integer.parseInt(sc.next());
            for(int j = 0;j < testimony_n;j++){
                person = Integer.parseInt(sc.next());
                person--;
                rumors[i][person] = Integer.parseInt(sc.next());
            }
        }
        
        boolean[] honesty = new boolean[n];
        boolean contradiction = false;
        int count = 0,max=0;
        
        for(int bit=0;bit < (1<<n);bit++){
            contradiction = false;
            for(int i=0;i < n;i++){
                honesty[i] = (bit&(1<<i))>0;
            }
            for(int i=0;i < n;i++){
                if(honesty[i]){
                    for(int j=0;j<n;j++){
                        if((rumors[i][j] == 0)&&(honesty[j])) contradiction=true;
                        if((rumors[i][j] == 1)&&(!honesty[j])) contradiction=true;
                    }
                }
            }
            if(!contradiction){
                count=0;
                for(int i=0;i < n;i++){
                    if(honesty[i]) count++;
                }
                max = count>max ? count : max;
            }
        }
        
        System.out.println(max);
    }
}